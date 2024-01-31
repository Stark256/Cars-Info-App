package com.cars.info.data.cars

import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.Dimensions
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelEfficiencyMPG
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType

object AUDI {

    private val AUDI_1 = Car(
        id = "a1",
        make = "Audi",
        model = "A4",
        year = 2022,
        price = 39100,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 24, highway = 31),
        topSpeed = 130,
        acceleration = 6.0f,
        horsepower = 201,
        torque = 236,
        wheelbase = 111.0f,
        curbWeight = 3483,
        dimensions = Dimensions(length = 188, width = 72, height = 56),
        cargoCapacity = 13.0f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® basic",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Sunroof",
            "Automatic Emergency Braking",
            "Audi Virtual Cockpit"
        )
    )

    private val AUDI_2 = Car(
        id = "a2",
        make = "Audi",
        model = "Q5",
        year = 2022,
        price = 43300,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 23, highway = 28),
        topSpeed = 130,
        acceleration = 5.8f,
        horsepower = 261,
        torque = 273,
        wheelbase = 111.0f,
        curbWeight = 4045,
        dimensions = Dimensions(length = 184, width = 75, height = 66),
        cargoCapacity = 25.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Audi MMI® touch display",
            "Audi pre sense® city",
            "Audi pre sense® basic",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Panoramic sunroof",
            "Power tailgate",
            "Three-zone automatic climate control"
        )
    )

    private val AUDI_3 = Car(
        id = "a3",
        make = "Audi",
        model = "A6",
        year = 2022,
        price = 54900,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 24, highway = 32),
        topSpeed = 130,
        acceleration = 6.1f,
        horsepower = 248,
        torque = 273,
        wheelbase = 115.1f,
        curbWeight = 4101,
        dimensions = Dimensions(length = 195, width = 74, height = 57),
        cargoCapacity = 13.7f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Sunroof",
            "Audi Virtual Cockpit",
            "Three-zone automatic climate control"
        )
    )

    private val AUDI_4 = Car(
        id = "a4",
        make = "Audi",
        model = "Q7",
        year = 2022,
        price = 54950,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 23),
        topSpeed = 130,
        acceleration = 5.7f,
        horsepower = 335,
        torque = 369,
        wheelbase = 117.9f,
        curbWeight = 4784,
        dimensions = Dimensions(length = 199, width = 77, height = 69),
        cargoCapacity = 14.2f,
        seatingCapacity = "7",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Audi pre sense® basic",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Panoramic sunroof",
            "Power-folding third row",
            "Four-zone automatic climate control"
        )
    )

    private val AUDI_5 = Car(
        id = "a5",
        make = "Audi",
        model = "A8",
        year = 2022,
        price = 86500,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 17, highway = 26),
        topSpeed = 130,
        acceleration = 5.6f,
        horsepower = 335,
        torque = 369,
        wheelbase = 123.1f,
        curbWeight = 4773,
        dimensions = Dimensions(length = 207, width = 77, height = 58),
        cargoCapacity = 12.5f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Panoramic sunroof",
            "Audi Virtual Cockpit",
            "Four-zone automatic climate control"
        )
    )

    private val AUDI_6 = Car(
        id = "a6",
        make = "Audi",
        model = "Q3",
        year = 2022,
        price = 36000,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 20, highway = 28),
        topSpeed = 130,
        acceleration = 7.8f,
        horsepower = 184,
        torque = 221,
        wheelbase = 105.5f,
        curbWeight = 3905,
        dimensions = Dimensions(length = 176, width = 73, height = 63),
        cargoCapacity = 23.7f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Panoramic sunroof",
            "Power tailgate",
            "Dual-zone automatic climate control"
        )
    )

    private val AUDI_7 = Car(
        id = "a7",
        make = "Audi",
        model = "e-tron",
        year = 2022,
        price = 65900,
        bodyType = BodyType.SUV,
        fuelType = FuelType.ELECTRIC,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Electric,
        fuelEfficiency = null,
        topSpeed = 124,
        acceleration = 5.5f,
        horsepower = 335,
        torque = 414,
        wheelbase = 115.3f,
        curbWeight = 5489,
        dimensions = Dimensions(length = 193, width = 76, height = 66),
        cargoCapacity = 28.5f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Panoramic sunroof",
            "Virtual side mirrors",
            "Four-zone automatic climate control"
        )
    )

    private val AUDI_8 = Car(
        id = "a8",
        make = "Audi",
        model = "A5",
        year = 2022,
        price = 44000,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 24, highway = 32),
        topSpeed = 130,
        acceleration = 5.6f,
        horsepower = 261,
        torque = 273,
        wheelbase = 108.8f,
        curbWeight = 3593,
        dimensions = Dimensions(length = 187, width = 73, height = 41),
        cargoCapacity = 11.6f,
        seatingCapacity = "4",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Sunroof",
            "Three-zone automatic climate control"
        )
    )

    private val AUDI_9 = Car(
        id = "a9",
        make = "Audi",
        model = "Q8",
        year = 2022,
        price = 69100,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 17, highway = 21),
        topSpeed = 130,
        acceleration = 5.6f,
        horsepower = 335,
        torque = 369,
        wheelbase = 117.9f,
        curbWeight = 5004,
        dimensions = Dimensions(length = 197, width = 78, height = 67),
        cargoCapacity = 30.5f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Audi pre sense® basic",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Panoramic sunroof",
            "Power-folding rear seats",
            "Four-zone automatic climate control"
        )
    )

    private val AUDI_10 = Car(
        id = "a10",
        make = "Audi",
        model = "S4",
        year = 2022,
        price = 50200,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 20, highway = 27),
        topSpeed = 155,
        acceleration = 4.4f,
        horsepower = 349,
        torque = 369,
        wheelbase = 111.2f,
        curbWeight = 3847,
        dimensions = Dimensions(length = 187, width = 72, height = 56),
        cargoCapacity = 12.0f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Sunroof",
            "Sport-tuned suspension",
            "Three-zone automatic climate control"
        )
    )

    private val AUDI_11 = Car(
        id = "a11",
        make = "Audi",
        model = "TT RS",
        year = 2022,
        price = 67600,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 19, highway = 26),
        topSpeed = 174,
        acceleration = 3.5f,
        horsepower = 394,
        torque = 354,
        wheelbase = 98.6f,
        curbWeight = 3294,
        dimensions = Dimensions(length = 165, width = 72, height = 53),
        cargoCapacity = 12.0f,
        seatingCapacity = "4",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Sport-tuned suspension",
            "Leather/Alcantara upholstery",
            "Virtual Cockpit",
            "Heated front seats",
            "Dual-zone automatic climate control"
        )
    )

    private val AUDI_12 = Car(
        id = "a12",
        make = "Audi",
        model = "RS Q8",
        year = 2022,
        price = 114500,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 4.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 13, highway = 19),
        topSpeed = 155,
        acceleration = 3.5f,
        horsepower = 591,
        torque = 590,
        wheelbase = 117.9f,
        curbWeight = 5300,
        dimensions = Dimensions(length = 199, width = 79, height = 67),
        cargoCapacity = 30.5f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch response",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Panoramic sunroof",
            "Power-folding rear seats",
            "Four-zone automatic climate control",
            "Adaptive Cruise Control"
        )
    )

    private val AUDI_13 = Car(
        id = "a13",
        make = "Audi",
        model = "SQ5",
        year = 2022,
        price = 53900,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 24),
        topSpeed = 155,
        acceleration = 4.7f,
        horsepower = 349,
        torque = 369,
        wheelbase = 111.2f,
        curbWeight = 4362,
        dimensions = Dimensions(length = 185, width = 75, height = 65),
        cargoCapacity = 25.1f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Panoramic sunroof",
            "Sport-tuned suspension",
            "Three-zone automatic climate control"
        )
    )

    private val AUDI_14 = Car(
        id = "a14",
        make = "Audi",
        model = "RS5 Sportback",
        year = 2022,
        price = 75100,
        bodyType = BodyType.SPORTBACK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.9f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 26),
        topSpeed = 155,
        acceleration = 3.8f,
        horsepower = 444,
        torque = 443,
        wheelbase = 111.2f,
        curbWeight = 4057,
        dimensions = Dimensions(length = 187, width = 73, height = 54),
        cargoCapacity = 21.8f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather/Alcantara upholstery",
            "Panoramic sunroof",
            "Virtual Cockpit",
            "Sport-tuned suspension",
            "Three-zone automatic climate control"
        )
    )

    private val AUDI_15 = Car(
        id = "a15",
        make = "Audi",
        model = "RS6 Avant",
        year = 2022,
        price = null,
        bodyType = BodyType.WAGON,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 4.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 15, highway = 22),
        topSpeed = 155,
        acceleration = 3.5f,
        horsepower = 591,
        torque = 590,
        wheelbase = 115.3f,
        curbWeight = 4873,
        dimensions = Dimensions(length = 197, width = 76, height = 59),
        cargoCapacity = 30.0f,
        seatingCapacity = "5",
        feature = listOf(
            "MMI® touch display",
            "Audi pre sense® city",
            "Apple CarPlay/Android Auto",
            "Audi drive select",
            "Leather upholstery",
            "Panoramic sunroof",
            "Power-folding rear seats",
            "Four-zone automatic climate control",
            "Adaptive Cruise Control, Virtual Cockpit"
        )
    )

    val list = listOf(AUDI_1, AUDI_2, AUDI_3, AUDI_4, AUDI_5, AUDI_6, AUDI_7, AUDI_8, AUDI_9, AUDI_10, AUDI_11, AUDI_12, AUDI_13, AUDI_14, AUDI_15)
}
