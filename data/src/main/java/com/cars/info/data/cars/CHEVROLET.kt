package com.cars.info.data.cars

import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.Dimensions
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelEfficiencyMPG
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType

object CHEVROLET {

    private val CHEVROLET_1 = Car(
        id = "c1",
        make = "Chevrolet",
        model = "Silverado 1500",
        year = 2022,
        price = 28600,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.7f),
        fuelEfficiency = FuelEfficiencyMPG(city = 20, highway = 23),
        topSpeed = 107,
        acceleration = 6.7f,
        horsepower = 310,
        torque = 348,
        wheelbase = 147.4f,
        curbWeight = 4474,
        dimensions = Dimensions(length = 241, width = 81, height = 76),
        cargoCapacity = null,
        seatingCapacity = "5-6",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Forward Collision Alert",
            "Automatic Emergency Braking"
        )
    )

    private val CHEVROLET_2 = Car(
        id = "c2",
        make = "Chevrolet",
        model = "Equinox",
        year = 2022,
        price = 23800,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 26, highway = 31),
        topSpeed = 120,
        acceleration = 8.9f,
        horsepower = 170,
        torque = 203,
        wheelbase = 107.3f,
        curbWeight = 3274,
        dimensions = Dimensions(length = 183, width = 73, height = 65),
        cargoCapacity = 29.9f,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Lane Keep Assist",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_3 = Car(
        id = "c3",
        make = "Chevrolet",
        model = "Malibu",
        year = 2022,
        price = 23300,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 29, highway = 36),
        topSpeed = 130,
        acceleration = 8.5f,
        horsepower = 160,
        torque = 184,
        wheelbase = 111.4f,
        curbWeight = 3126,
        dimensions = Dimensions(length = 194, width = 74, height = 57),
        cargoCapacity = 15.7f,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "8-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Lane Change Alert with Side Blind Zone Alert"
        )
    )

    private val CHEVROLET_4 = Car(
        id = "c4",
        make = "Chevrolet",
        model = "Traverse",
        year = 2022,
        price = 29800,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.6f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 27),
        topSpeed = 130,
        acceleration = 7.2f,
        horsepower = 310,
        torque = 266,
        wheelbase = 120.9f,
        curbWeight = 4685,
        dimensions = Dimensions(length = 204, width = 78, height = 71),
        cargoCapacity = 23.0f,
        seatingCapacity = "7-8",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Lane Keep Assist with Lane Departure Warning",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_5 = Car(
        id = "c5",
        make = "Chevrolet",
        model = "Silverado 2500HD",
        year = 2022,
        price = 34700,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 6.6f),
        fuelEfficiency = FuelEfficiencyMPG(city = 17, highway = 22),
        topSpeed = 98,
        acceleration = null,
        horsepower = 401,
        torque = 464,
        wheelbase = 158.9f,
        curbWeight = 6199,
        dimensions = Dimensions(length = 266, width = 81, height = 79),
        cargoCapacity = null,
        seatingCapacity = "5-6",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Forward Collision Alert",
            "Automatic Emergency Braking"
        )
    )

    private val CHEVROLET_6 = Car(
        id = "c6",
        make = "Chevrolet",
        model = "Blazer",
        year = 2022,
        price = 28800,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 22, highway = 27),
        topSpeed = 115,
        acceleration = 9.3f,
        horsepower = 193,
        torque = 188,
        wheelbase = 112.7f,
        curbWeight = 3810,
        dimensions = Dimensions(length = 192, width = 76, height = 67),
        cargoCapacity = 30.5f,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "8-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Lane Change Alert with Side Blind Zone Alert",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_7 = Car(
        id = "c7",
        make = "Chevrolet",
        model = "Colorado",
        year = 2022,
        price = 25200,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 19, highway = 25),
        topSpeed = 112,
        acceleration = 9.4f,
        horsepower = 200,
        torque = 191,
        wheelbase = 128.3f,
        curbWeight = 3936,
        dimensions = Dimensions(length = 212, width = 74, height = 70),
        cargoCapacity = null,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Teen Driver Technology",
            "Rear Vision Camera",
            "Forward Collision Alert",
            "Automatic Emergency Braking"
        )
    )

    private val CHEVROLET_8 = Car(
        id = "c8",
        make = "Chevrolet",
        model = "Camaro",
        year = 2022,
        price = 75000,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.MANUAL,
        engineDisplacement = EngineDisplacement.Value(value = 6.2f),
        fuelEfficiency = FuelEfficiencyMPG(city = 19, highway = 29),
        topSpeed = 198,
        acceleration = 3.5f,
        horsepower = 650,
        torque = 650,
        wheelbase = 110.7f,
        curbWeight = 3627,
        dimensions = Dimensions(length = 212, width = 74, height = 70),
        cargoCapacity = null,
        seatingCapacity = "4-5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Rear Vision Camera",
            "Forward Collision Alert",
            "Rear Park Assist",
            "Teen Driver Technology"
        )
    )

    private val CHEVROLET_9 = Car(
        id = "c9",
        make = "Chevrolet",
        model = "Tahoe",
        year = 2022,
        price = 49600,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 5.3f),
        fuelEfficiency = FuelEfficiencyMPG(city = 16, highway = 20),
        topSpeed = 120,
        acceleration = 7.1f,
        horsepower = 355,
        torque = 383,
        wheelbase = 120.9f,
        curbWeight = 5383,
        dimensions = Dimensions(length = 210, width = 81, height = 75),
        cargoCapacity = 25.5f,
        seatingCapacity = "7-9",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "10.2-inch Touchscreen",
            "Rear Camera Mirror",
            "Lane Change Alert with Side Blind Zone Alert",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_10 = Car(
        id = "c10",
        make = "Chevrolet",
        model = "Sonic",
        year = 2022,
        price = 16700,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.4f),
        fuelEfficiency = FuelEfficiencyMPG(city = 26, highway = 34),
        topSpeed = 107,
        acceleration = 7.8f,
        horsepower = 138,
        torque = 148,
        wheelbase = 99.4f,
        curbWeight = 2857,
        dimensions = Dimensions(length = 159, width = 68, height = 59),
        cargoCapacity = 19.0f,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Rear Vision Camera",
            "Lane Departure Warning",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_11 = Car(
        id = "c11",
        make = "Chevrolet",
        model = "Suburban",
        year = 2022,
        price = 52600,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 5.3f),
        fuelEfficiency = FuelEfficiencyMPG(city = 16, highway = 20),
        topSpeed = 120,
        acceleration = 7.1f,
        horsepower = 355,
        torque = 383,
        wheelbase = 134.1f,
        curbWeight = 5827,
        dimensions = Dimensions(length = 225, width = 81, height = 75),
        cargoCapacity = 41.5f,
        seatingCapacity = "7-9",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "10.2-inch Touchscreen",
            "Rear Camera Mirror",
            "Lane Change Alert with Side Blind Zone Alert",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_12 = Car(
        id = "c12",
        make = "Chevrolet",
        model = "Trax",
        year = 2022,
        price = 21300,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.4f),
        fuelEfficiency = FuelEfficiencyMPG(city = 26, highway = 31),
        topSpeed = 138,
        acceleration = 9.3f,
        horsepower = 155,
        torque = 177,
        wheelbase = 100.6f,
        curbWeight = 3120,
        dimensions = Dimensions(length = 167, width = 69, height = 66),
        cargoCapacity = 18.7f,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Rear Vision Camera",
            "Lane Departure Warning",
            "Forward Collision Alert"
        )
    )

    private val CHEVROLET_13 = Car(
        id = "c13",
        make = "Chevrolet",
        model = "Bolt EV",
        year = 2022,
        price = 31000,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.ELECTRIC,
        transmissionType = TransmissionType.SINGLESPEED,
        engineDisplacement = EngineDisplacement.Electric,
        fuelEfficiency = FuelEfficiencyMPG(city = 127, highway = 108),
        topSpeed = 93,
        acceleration = 6.5f,
        horsepower = 200,
        torque = 266,
        wheelbase = 102.4f,
        curbWeight = 3563,
        dimensions = Dimensions(length = 164, width = 69, height = 63),
        cargoCapacity = 16.6f,
        seatingCapacity = "5",
        feature = listOf(
            "Chevrolet Infotainment 3 System",
            "Apple CarPlay/Android Auto",
            "10.2-inch Touchscreen",
            "Rear Vision Camera",
            "Forward Collision Alert",
            "Lane Departure Warning"
        )
    )

    val list = listOf(
        CHEVROLET_1, CHEVROLET_2, CHEVROLET_3, CHEVROLET_4, CHEVROLET_5, CHEVROLET_6, CHEVROLET_7, CHEVROLET_8, CHEVROLET_9, CHEVROLET_10, CHEVROLET_11, CHEVROLET_12, CHEVROLET_13
    )
}
