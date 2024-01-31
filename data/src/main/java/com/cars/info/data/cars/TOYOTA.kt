package com.cars.info.data.cars

import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.Dimensions
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelEfficiencyMPG
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType

object TOYOTA {

    private val TOYOTA_1 = Car(
        id = "t1",
        make = "Toyota",
        model = "Camry",
        year = 2022,
        price = 24970,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 28, highway = 39),
        topSpeed = 115,
        acceleration = 7.5f,
        horsepower = 203,
        torque = 184,
        wheelbase = 111.2f,
        curbWeight = 3265,
        dimensions = Dimensions(length = 194, width = 73, height = 57),
        cargoCapacity = 15.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense 2.5+",
            "Apple CarPlay/Android Auto",
            "Touchscreen Display",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Dual-Zone Automatic Climate Control"
        )
    )

    private val TOYOTA_2 = Car(
        id = "t2",
        make = "Toyota",
        model = "RAV4",
        year = 2022,
        price = 26350,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 27, highway = 35),
        topSpeed = 120,
        acceleration = 8.1f,
        horsepower = 203,
        torque = 184,
        wheelbase = 105.9f,
        curbWeight = 3370,
        dimensions = Dimensions(length = 181, width = 73, height = 68),
        cargoCapacity = 37.5f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense 2.0",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Dual-Zone Automatic Climate Control"
        )
    )

    private val TOYOTA_3 = Car(
        id = "t3",
        make = "Toyota",
        model = "Corolla",
        year = 2022,
        price = 20025,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.8f),
        fuelEfficiency = FuelEfficiencyMPG(city = 30, highway = 38),
        topSpeed = 115,
        acceleration = 9.7f,
        horsepower = 139,
        torque = 126,
        wheelbase = 106.3f,
        curbWeight = 2910,
        dimensions = Dimensions(length = 182, width = 70, height = 57),
        cargoCapacity = 13.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense 2.0",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking, Rearview Camera"
        )
    )

    private val TOYOTA_4 = Car(
        id = "t4",
        make = "Toyota",
        model = "Highlander",
        year = 2022,
        price = 34810,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 29),
        topSpeed = 115,
        acceleration = 7.3f,
        horsepower = 295,
        torque = 263,
        wheelbase = 112.2f,
        curbWeight = 4165,
        dimensions = Dimensions(length = 195, width = 76, height = 68),
        cargoCapacity = 16.0f,
        seatingCapacity = "8",
        feature = listOf(
            "Toyota Safety Sense 2.5+",
            "Apple CarPlay/Android Auto",
            "8-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Three-Zone Automatic Climate Control"
        )
    )

    private val TOYOTA_5 = Car(
        id = "t5",
        make = "Toyota",
        model = "Tacoma",
        year = 2022,
        price = 26400,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 22),
        topSpeed = 113,
        acceleration = 7.0f,
        horsepower = 278,
        torque = 265,
        wheelbase = 127.4f,
        curbWeight = 4425,
        dimensions = Dimensions(length = 225, width = 75, height = 71),
        cargoCapacity = null,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense P",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "GoPro® Mount on Windshield"
        )
    )

    private val TOYOTA_6 = Car(
        id = "t6",
        make = "Toyota",
        model = "Sienna",
        year = 2022,
        price = 34460,
        bodyType = BodyType.MINIVAN,
        fuelType = FuelType.HYBRID,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 36, highway = 36),
        topSpeed = 115,
        acceleration = 7.7f,
        horsepower = 245,
        torque = null,
        wheelbase = 120.5f,
        curbWeight = 4615,
        dimensions = Dimensions(length = 205, width = 78, height = 68),
        cargoCapacity = null,
        seatingCapacity = "7-8",
        feature = listOf(
            "Toyota Safety Sense 2.0",
            "Apple CarPlay/Android Auto",
            "9-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Dual Power Sliding Doors"
        )
    )

    private val TOYOTA_7 = Car(
        id = "t7",
        make = "Toyota",
        model = "Prius",
        year = 2022,
        price = 24525,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.HYBRID,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.8f),
        fuelEfficiency = FuelEfficiencyMPG(city = 58, highway = 53),
        topSpeed = 112,
        acceleration = 10.5f,
        horsepower = 121,
        torque = null,
        wheelbase = 106.3f,
        curbWeight = 3010,
        dimensions = Dimensions(length = 180, width = 69, height = 57),
        cargoCapacity = 27.4f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense 2.0",
            "Apple CarPlay/Android Auto",
            "7-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera"
        )
    )

    private val TOYOTA_8 = Car(
        id = "t8",
        make = "Toyota",
        model = "4Runner ",
        year = 2022,
        price = 36115,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 4.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 16, highway = 19),
        topSpeed = 113,
        acceleration = 7.5f,
        horsepower = 270,
        torque = 278,
        wheelbase = 109.8f,
        curbWeight = 4805,
        dimensions = Dimensions(length = 190, width = 76, height = 72),
        cargoCapacity = 47.2f,
        seatingCapacity = "5-7",
        feature = listOf(
            "Toyota Safety Sense P",
            "Apple CarPlay/Android Auto",
            "8-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Off-Road Capability"
        )
    )

    private val TOYOTA_9 = Car(
        id = "t9",
        make = "Toyota",
        model = "C-HR",
        year = 2022,
        price = 21645,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 27, highway = 31),
        topSpeed = 115,
        acceleration = 11.0f,
        horsepower = 144,
        torque = 139,
        wheelbase = 103.9f,
        curbWeight = 3300,
        dimensions = Dimensions(length = 172, width = 71, height = 61),
        cargoCapacity = 19.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense P",
            "Apple CarPlay/Android Auto",
            "8-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera"
        )
    )

    private val TOYOTA_10 = Car(
        id = "t10",
        make = "Toyota",
        model = "Avalon",
        year = 2022,
        price = 36125,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 22, highway = 31),
        topSpeed = 130,
        acceleration = 6.0f,
        horsepower = 301,
        torque = 267,
        wheelbase = 113.0f,
        curbWeight = 3560,
        dimensions = Dimensions(length = 196, width = 74, height = 56),
        cargoCapacity = 16.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense P",
            "Apple CarPlay/Android Auto",
            "9-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Dual-Zone Automatic Climate Control"
        )
    )

    private val TOYOTA_11 = Car(
        id = "t11",
        make = "Toyota",
        model = "Land Cruiser",
        year = 2022,
        price = 85665,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 5.7f),
        fuelEfficiency = FuelEfficiencyMPG(city = 13, highway = 17),
        topSpeed = 130,
        acceleration = 7.3f,
        horsepower = 381,
        torque = 401,
        wheelbase = 112.2f,
        curbWeight = 5715,
        dimensions = Dimensions(length = 165, width = 78, height = 76),
        cargoCapacity = 16.1f,
        seatingCapacity = "8",
        feature = listOf(
            "Toyota Safety Sense P",
            "Premium Audio with JBL®",
            "9-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Multi-Terrain Select"
        )
    )

    private val TOYOTA_12 = Car(
        id = "t12",
        make = "Toyota",
        model = "Supra",
        year = 2022,
        price = 42990,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 22, highway = 30),
        topSpeed = 155,
        acceleration = 3.9f,
        horsepower = 382,
        torque = 368,
        wheelbase = 97.2f,
        curbWeight = 3397,
        dimensions = Dimensions(length = 173, width = 74, height = 54),
        cargoCapacity = 10.2f,
        seatingCapacity = "2",
        feature = listOf(
            "Toyota Safety Sense 2.0",
            "Apple CarPlay/Android Auto",
            "8.8-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera",
            "Launch Control"
        )
    )

    private val TOYOTA_13 = Car(
        id = "t13",
        make = "Toyota",
        model = "Yaris",
        year = 2022,
        price = 15650,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 32, highway = 40),
        topSpeed = 109,
        acceleration = 9.0f,
        horsepower = 106,
        torque = 103,
        wheelbase = 101.2f,
        curbWeight = 2385,
        dimensions = Dimensions(length = 161, width = 67, height = 59),
        cargoCapacity = 15.9f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense C",
            "7-inch Touchscreen",
            "Automatic Emergency Braking",
            "Lane Departure Warning",
            "Rearview Camera"
        )
    )

    private val TOYOTA_14 = Car(
        id = "t14",
        make = "Toyota",
        model = "Prius Prime",
        year = 2022,
        price = 28220,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.PLUGIN,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.8f),
        fuelEfficiency = FuelEfficiencyMPG(city = 55, highway = 53),
        topSpeed = 101,
        acceleration = 10.6f,
        horsepower = 121,
        torque = null,
        wheelbase = 106.3f,
        curbWeight = 3375,
        dimensions = Dimensions(length = 181, width = 69, height = 57),
        cargoCapacity = 19.8f,
        seatingCapacity = "4",
        feature = listOf(
            "Toyota Safety Sense P",
            "11.6-inch Touchscreen",
            "Adaptive Cruise Control",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Rearview Camera"
        )
    )

    private val TOYOTA_15 = Car(
        id = "t15",
        make = "Toyota",
        model = "Prius c",
        year = 2022,
        price = 21515,
        bodyType = BodyType.HATCHBACK,
        fuelType = FuelType.HYBRID,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 48, highway = 43),
        topSpeed = 99,
        acceleration = 11.3f,
        horsepower = 99,
        torque = 82,
        wheelbase = 100.4f,
        curbWeight = 2530,
        dimensions = Dimensions(length = 159, width = 67, height = 58),
        cargoCapacity = 17.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Toyota Safety Sense C",
            "6.1-inch Touchscreen",
            "Automatic Emergency Braking",
            "Lane Departure Warning",
            "Rearview Camera"
        )
    )

    val list = listOf(
        TOYOTA_1, TOYOTA_2, TOYOTA_3, TOYOTA_4, TOYOTA_5, TOYOTA_6, TOYOTA_7, TOYOTA_8, TOYOTA_9, TOYOTA_10, TOYOTA_11, TOYOTA_12, TOYOTA_13, TOYOTA_14, TOYOTA_15
    )
}
