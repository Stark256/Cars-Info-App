package com.cars.info

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import com.cars.info.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private val navigationController: NavController
        get() = findNavController(R.id.main_navigation_fragment)

    private val viewModel: MainViewModel by viewModels()

    private val onNavigationDestinationChangeListener =
        NavController.OnDestinationChangedListener {  _, destination, _ ->
            viewModel.onNewDestination(destination.id)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.action.onEach(::handleEvent)
            }
        }
    }

    override fun onStart() {
        super.onStart()

        navigationController.addOnDestinationChangedListener(onNavigationDestinationChangeListener)

        binding?.bottomNavView?.apply {
            navigationController.addOnDestinationChangedListener { _, destination, _ ->
                menu.children
                    .firstOrNull {
                        it.itemId == destination.id ||
                            it.itemId == destination.parent?.id ||
                            it.itemId == destination.parent?.parent?.id
                    }?.let {
                        it.isChecked = true
                    }
            }

            val option = NavOptions.Builder()
                .setLaunchSingleTop(true)
                .setPopUpTo(R.id.nav_graph, true)
                .build()

            setOnItemReselectedListener { menuItem ->
                navigationController
                    .takeIf { it.currentDestination?.id != menuItem.itemId }
                    ?.navigate(menuItem.itemId, null, option)
            }
            setOnItemSelectedListener {
                navigationController.navigate(it.itemId, null, option)
                true
            }
        }
    }

    override fun onStop() {
        super.onStop()

        navigationController.removeOnDestinationChangedListener(onNavigationDestinationChangeListener)
    }

    private fun handleEvent(event: Event<MainViewModel.Action>) {
        when (event.pop()) {
            is MainViewModel.Action.GoToSearch -> navigateToSearchScreen()
            is MainViewModel.Action.GoToFavourites -> navigateToFavouritesScreen()
            is MainViewModel.Action.GoToAccount -> navigateToAccountScreen()
            null -> skip
        }
    }

    private fun navigateToSearchScreen() {
        binding?.bottomNavView?.selectedItemId = R.id.search_nav
    }

    private fun navigateToFavouritesScreen() {
        binding?.bottomNavView?.selectedItemId = R.id.favourites_nav
    }

    private fun navigateToAccountScreen() {
        binding?.bottomNavView?.selectedItemId = R.id.account_nav
    }
}