package com.cars.info.data.utils

import android.content.Context
import com.cars.info.common.models.CarListItemUI
import com.cars.info.common.R
import com.cars.info.common.models.ImageTextUI
import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType
import java.text.NumberFormat
import java.util.Locale

fun BodyType.getUIString(context: Context): String =
    context.getString(
        when(this) {
            BodyType.SEDAN -> R.string.body_type_sedan
            BodyType.SUV -> R.string.body_type_suv
            BodyType.COUPE -> R.string.body_type_coupe
            BodyType.SPORTBACK -> R.string.body_type_sportback
            BodyType.SPORTSCAR -> R.string.body_type_sportcar
            BodyType.WAGON -> R.string.body_type_wagon
            BodyType.TRUCK -> R.string.body_type_truck
            BodyType.HATCHBACK -> R.string.body_type_hatchback
            BodyType.MINIVAN -> R.string.body_type_minivan
            BodyType.VAN -> R.string.body_type_van
        }
    )

fun FuelType.getUIString(context: Context): String =
    context.getString(
        when(this) {
            FuelType.GASOLINE -> R.string.fuel_type_gasoline
            FuelType.ELECTRIC -> R.string.fuel_type_electric
            FuelType.HYBRID -> R.string.fuel_type_hybrid
            FuelType.PLUGIN -> R.string.fuel_type_plugin
        }
    )

fun TransmissionType.getUIString(context: Context): String =
    context.getString(
        when(this) {
            TransmissionType.AUTOMATIC -> R.string.transmission_type_automatic
            TransmissionType.MANUAL -> R.string.transmission_type_manual
            TransmissionType.ECVT -> R.string.transmission_type_ecvt
            TransmissionType.SINGLESPEED -> R.string.transmission_type_singlespeed
        }
    )

fun Car.convertToListItemUi(context: Context): CarListItemUI {

    fun getName(): String =
        String.format(
            context.getString(R.string.car_list_item_name_format),
            this.make,
            this.model,
            this.year
        )

    fun getShortDescription(): String =
        String.format(
            context.getString(R.string.car_list_item_short_desc_format),
            this.bodyType.getUIString(context),
            this.horsepower,
            this.acceleration ?: ""
        )

    fun getEngineDescText(): String =
        when(val engineDisplacementValue = this.engineDisplacement) {
            is EngineDisplacement.Value -> String.format(
                context.getString(R.string.car_list_item_engine_desc_format),
                this.fuelType.getUIString(context),
                engineDisplacementValue.value
            )
            else -> context.getString(R.string.fuel_type_electric)
        }


    fun getEngineDescIcon(): Int =
        when(this.engineDisplacement) {
            is EngineDisplacement.Value -> R.drawable.ic_gas_station
            else -> R.drawable.ic_electric_station
        }

    fun getTransmissionDescIcon(): Int =
        when(this.transmissionType) {
            TransmissionType.MANUAL -> R.drawable.ic_transmission_manual
            else -> R.drawable.ic_transmission_auto
        }

    fun getPrice(context: Context): String =
        this.price?.let {
            NumberFormat.getCurrencyInstance(Locale.US).format(this.price)
        } ?: context.getString(R.string.empty_string)

    return CarListItemUI.Builder()
        .id(this.id)
        .make(this.make)
        .name(getName())
        .imageUrl(this.imageUrl)
        .shortDescription(getShortDescription())
        .price(getPrice(context))
        .engineDesc(
            ImageTextUI(
                text = getEngineDescText(),
                icon = getEngineDescIcon()
            )
        )
        .transmissionDesc(
            ImageTextUI(
                text = this.transmissionType.getUIString(context),
                icon = getTransmissionDescIcon()
            )
        )
        .build()
}