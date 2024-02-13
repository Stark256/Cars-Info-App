package com.cars.info.data.models.filter

import com.cars.info.data.models.car.BodyType
import com.cars.info.data.models.car.FuelType
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.car.TransmissionType

data class FilterOptions(
    val makes: List<Make>,
    val priceRange: IntRange?,
    val bodyTypes: List<BodyType>,
    val fuelType: List<FuelType>,
    val transmissionTypes: List<TransmissionType>
) {
    companion object {
        fun default(
            makes: List<Make> = emptyList(),
            priceRange: IntRange? = null,
            bodyTypes: List<BodyType> = emptyList(),
            fuelType: List<FuelType> = emptyList(),
            transmissionTypes: List<TransmissionType> = emptyList()
        ) = FilterOptions(
            makes = makes,
            priceRange = priceRange,
            bodyTypes = bodyTypes,
            fuelType = fuelType,
            transmissionTypes = transmissionTypes
        )
    }
}
