package com.cars.info.data.cars

import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.Dimensions
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelEfficiencyMPG
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType

object NISSAN {

    private val NISSAN_1 = Car(
        id = "n1",
        make = "Nissan",
        model = "Altima",
        year = 2022,
        price = 24350,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 28, highway = 39),
        topSpeed = 133,
        acceleration = 7.6f,
        horsepower = 188,
        torque = 180,
        wheelbase = 111.2f,
        curbWeight = 3199,
        dimensions = Dimensions(length = 193, width = 73, height = 57),
        cargoCapacity = 15.4f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "ProPILOT Assist",
            "Intelligent Forward Collision Warning",
            "RearView Monitor"
        )
    )

    private val NISSAN_2 = Car(
        id = "n2",
        make = "Nissan",
        model = "Rogue",
        year = 2022,
        price = 25750,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 27, highway = 35),
        topSpeed = 130,
        acceleration = 9.0f,
        horsepower = 181,
        torque = 181,
        wheelbase = 106.5f,
        curbWeight = 3454,
        dimensions = Dimensions(length = 184, width = 72, height = 68),
        cargoCapacity = 36.5f,
        seatingCapacity = "5-7",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "ProPILOT Assist",
            "Safety Shield® 360",
            "Intelligent Lane Intervention"
        )
    )

    private val NISSAN_3 = Car(
        id = "n3",
        make = "Nissan",
        model = "Sentra",
        year = 2022,
        price = 20410,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 29, highway = 39),
        topSpeed = 124,
        acceleration = 7.3f,
        horsepower = 149,
        torque = 146,
        wheelbase = 106.8f,
        curbWeight = 3084,
        dimensions = Dimensions(length = 183, width = 72, height = 57),
        cargoCapacity = 14.3f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Cruise Control",
            "Blind Spot Warning"
        )
    )

    private val NISSAN_4 = Car(
        id = "n4",
        make = "Nissan",
        model = "Murano",
        year = 2022,
        price = 32510,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 20, highway = 28),
        topSpeed = 120,
        acceleration = 7.0f,
        horsepower = 260,
        torque = 240,
        wheelbase = 111.2f,
        curbWeight = 3903,
        dimensions = Dimensions(length = 192, width = 75, height = 67),
        cargoCapacity = 32.1f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Cruise Control",
            "Rear Cross Traffic Alert"
        )
    )

    private val NISSAN_5 = Car(
        id = "n5",
        make = "Nissan",
        model = "Maxima",
        year = 2022,
        price = 37240,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 20, highway = 30),
        topSpeed = 134,
        acceleration = 5.7f,
        horsepower = 300,
        torque = 261,
        wheelbase = 109.3f,
        curbWeight = 3552,
        dimensions = Dimensions(length = 192, width = 73, height = 57),
        cargoCapacity = 14.3f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Forward Collision Warning",
            "Rear Automatic Braking"
        )
    )

    private val NISSAN_6 = Car(
        id = "n6",
        make = "Nissan",
        model = "Titan",
        year = 2022,
        price = 36550,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 5.6f),
        fuelEfficiency = FuelEfficiencyMPG(city = 15, highway = 21),
        topSpeed = 110,
        acceleration = null,
        horsepower = 400,
        torque = 413,
        wheelbase = 139.8f,
        curbWeight = 5811,
        dimensions = Dimensions(length = 229, width = 80, height = 76),
        cargoCapacity = null,
        seatingCapacity = "5-6",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Around View® Monitor",
            "Dual Zone Automatic Temperature Control"
        )
    )

    private val NISSAN_7 = Car(
        id = "n7",
        make = "Nissan",
        model = "Kicks",
        year = 2022,
        price = 19500,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.6f),
        fuelEfficiency = FuelEfficiencyMPG(city = 31, highway = 36),
        topSpeed = 110,
        acceleration = 9.7f,
        horsepower = 122,
        torque = 114,
        wheelbase = 103.1f,
        curbWeight = 2744,
        dimensions = Dimensions(length = 170, width = 67, height = 63),
        cargoCapacity = 25.3f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Driver Alertness",
            "Automatic Emergency Braking with Pedestrian Detection"
        )
    )

    private val NISSAN_8 = Car(
        id = "n8",
        make = "Nissan",
        model = "Pathfinder",
        year = 2022,
        price = 31980,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 26),
        topSpeed = 120,
        acceleration = 6.7f,
        horsepower = 284,
        torque = 259,
        wheelbase = 114.2f,
        curbWeight = 4577,
        dimensions = Dimensions(length = 198, width = 77, height = 69),
        cargoCapacity = 16.6f,
        seatingCapacity = "7-8",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Cruise Control",
            "Intelligent 4x4"
        )
    )

    private val NISSAN_9 = Car(
        id = "n9",
        make = "Nissan",
        model = "Armada",
        year = 2022,
        price = 48900,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 5.6f),
        fuelEfficiency = FuelEfficiencyMPG(city = 14, highway = 19),
        topSpeed = 133,
        acceleration = 5.9f,
        horsepower = 400,
        torque = 413,
        wheelbase = 121.1f,
        curbWeight = 5956,
        dimensions = Dimensions(length = 208, width = 80, height = 76),
        cargoCapacity = 16.5f,
        seatingCapacity = "7-8",
        feature = listOf(
            "NissanConnect® 12.3-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Intelligent Rear View Mirror",
            "Tri-Zone Entertainment System"
        )
    )

    private val NISSAN_10 = Car(
        id = "n10",
        make = "Nissan",
        model = "370Z",
        year = 2022,
        price = 30090,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.MANUAL,
        engineDisplacement = EngineDisplacement.Value(value = 3.7f),
        fuelEfficiency = FuelEfficiencyMPG(city = 17, highway = 26),
        topSpeed = 155,
        acceleration = 5.1f,
        horsepower = 332,
        torque = 270,
        wheelbase = 100.4f,
        curbWeight = 3334,
        dimensions = Dimensions(length = 170, width = 74, height = 51),
        cargoCapacity = 6.9f,
        seatingCapacity = "2",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Bose® Audio System",
            "Active Noise Cancellation",
            "RearView Monitor"
        )
    )

    private val NISSAN_11 = Car(
        id = "n11",
        make = "Nissan",
        model = "GT-R",
        year = 2022,
        price = 113540,
        bodyType = BodyType.SPORTSCAR,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.8f),
        fuelEfficiency = FuelEfficiencyMPG(city = 16, highway = 22),
        topSpeed = 196,
        acceleration = 2.7f,
        horsepower = 565,
        torque = 467,
        wheelbase = 109.4f,
        curbWeight = 3933,
        dimensions = Dimensions(length = 185, width = 75, height = 54),
        cargoCapacity = 8.8f,
        seatingCapacity = "4",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Bose® Audio System",
            "Active Noise Cancellation",
            "RearView Monitor"
        )
    )

    private val NISSAN_12 = Car(
        id = "n12",
        make = "Nissan",
        model = "Frontier",
        year = 2022,
        price = 27190,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.8f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 24),
        topSpeed = 115,
        acceleration = null,
        horsepower = 310,
        torque = 281,
        wheelbase = 126.0f,
        curbWeight = 4502,
        dimensions = Dimensions(length = 219, width = 73, height = 72),
        cargoCapacity = null,
        seatingCapacity = "4-5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Bed Rail Caps",
            "Utili-track® Channel System"
        )
    )

    private val NISSAN_13 = Car(
        id = "n13",
        make = "Nissan",
        model = "Versa",
        year = 2022,
        price = 14930,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.6f),
        fuelEfficiency = FuelEfficiencyMPG(city = 32, highway = 40),
        topSpeed = 113,
        acceleration = 8.5f,
        horsepower = 122,
        torque = 114,
        wheelbase = 103.1f,
        curbWeight = 2599,
        dimensions = Dimensions(length = 177, width = 67, height = 58),
        cargoCapacity = 14.3f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 7-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "Lane Departure Warning",
            "Automatic Emergency Braking with Pedestrian Detection"
        )
    )

    private val NISSAN_14 = Car(
        id = "n14",
        make = "Nissan",
        model = "LEAF",
        year = 2022,
        price = 27400,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.ELECTRIC,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Electric,
        fuelEfficiency = FuelEfficiencyMPG(city = 123, highway = 99),
        topSpeed = 98,
        acceleration = 6.7f,
        horsepower = 147,
        torque = 236,
        wheelbase = 106.3f,
        curbWeight = 3461,
        dimensions = Dimensions(length = 176, width = 70, height = 61),
        cargoCapacity = 23.6f,
        seatingCapacity = "5",
        feature = listOf(
            "NissanConnect® 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Nissan Safety Shield® 360",
            "e-Pedal",
            "ProPILOT Assist"
        )
    )

    private val NISSAN_15 = Car(
        id = "n15",
        make = "Nissan",
        model = "NV200 Compact Cargo",
        year = 2022,
        price = 23800,
        bodyType = BodyType.VAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 24, highway = 26),
        topSpeed = 123,
        acceleration = null,
        horsepower = 131,
        torque = 139,
        wheelbase = 115.2f,
        curbWeight = 3347,
        dimensions = Dimensions(length = 186, width = 68, height = 73),
        cargoCapacity = null,
        seatingCapacity = "2",
        feature = listOf(
            "NissanConnect® 7-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "RearView Monitor",
            "Sliding Side Door",
            "Cargo Tie-Down Hooks"
        )
    )

    val list = listOf(
        NISSAN_1, NISSAN_2, NISSAN_3, NISSAN_4, NISSAN_5, NISSAN_6, NISSAN_7, NISSAN_8, NISSAN_9, NISSAN_10, NISSAN_11, NISSAN_12, NISSAN_13, NISSAN_14, NISSAN_15
    )
}
