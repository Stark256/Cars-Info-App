package com.cars.info.data.cars

import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.Dimensions
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelEfficiencyMPG
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType


object BMW {
    private val BMW_1 = Car(
        id = "b1",
        make = "BMW",
        model = "3 Series",
        year = 2022,
        price = 41250,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 26, highway = 36),
        topSpeed = 155,
        acceleration = 5.3f,
        horsepower = 255,
        torque = 295,
        wheelbase = 112.2f,
        curbWeight = 3560,
        dimensions = Dimensions(length = 185, width = 72, height = 56),
        cargoCapacity = 17.0f,
        seatingCapacity = "5",
        feature = listOf(
            "Adaptive Cruise Control",
            "Apple CarPlay/Android Auto",
            "Lane Departure Warning",
            "Automatic Emergency Braking",
            "Navigation System",
            "Leather Seats",
            "Sunroof",
            "Parking Sensors",
            "Keyless Entry",
            "Bluetooth Connectivity"
        )
    )

    private val BMW_2 = Car(
        id = "b2",
        make = "BMW",
        model = "5 Series",
        year = 2022,
        price = 54200,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 25, highway = 33),
        topSpeed = 155,
        acceleration = 5.5f,
        horsepower = 248,
        torque = 258,
        wheelbase = 117.1f,
        curbWeight = 3880,
        dimensions = Dimensions(length = 195, width = 74, height = 58),
        cargoCapacity = 14.0f,
        seatingCapacity = "5",
        feature = listOf(
            "Heads-Up Display",
            "Gesture Control",
            "Wireless Charging",
            "Surround View Camera",
            "Adaptive LED Headlights",
            "Apple CarPlay/Android Auto",
            "Harman Kardon Sound System",
            "Active Park Distance Control",
            "Navigation System",
            "Leather Seats"
        )
    )

    private val BMW_3 = Car(
        id = "b3",
        make = "BMW",
        model = "X3",
        year = 2022,
        price = 43700,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 23, highway = 29),
        topSpeed = 130,
        acceleration = 6.0f,
        horsepower = 248,
        torque = 258,
        wheelbase = 112.8f,
        curbWeight = 4145,
        dimensions = Dimensions(length = 186, width = 74, height = 66),
        cargoCapacity = 28.7f,
        seatingCapacity = "5",
        feature = listOf(
            "Panoramic Moonroof",
            "Power Tailgate",
            "iDrive Infotainment System",
            "Apple CarPlay/Android Auto",
            "Driver Assistance Package",
            "Parking Assistant",
            "Dual-Zone Automatic Climate Control",
            "Lane Departure Warning",
            "Blind Spot Detection"
        )
    )

    private val BMW_4 = Car(
        id = "b4",
        make = "BMW",
        model = "X5",
        year = 2022,
        price = 60395,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 26),
        topSpeed = 143,
        acceleration = 5.3f,
        horsepower = 335,
        torque = 330,
        wheelbase = 117.1f,
        curbWeight = 4815,
        dimensions = Dimensions(length = 164, width = 79, height = 69),
        cargoCapacity = 33.9f,
        seatingCapacity = "5-7",
        feature = listOf(
            "Adaptive Cruise Control",
            "Gesture Control",
            "Wi-Fi Hotspot",
            "Wireless Charging",
            "Apple CarPlay/Android Auto",
            "Harman Kardon Surround Sound System",
            "Dynamic Digital Instrument Cluster",
            "Parking Assistant Plus",
            "Lane Keeping Assist",
            "3rd-Row Seating"
        )
    )

    private val BMW_5 = Car(
        id = "b5",
        make = "BMW",
        model = "7 Series",
        year = 2022,
        price = 86800,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 22, highway = 29),
        topSpeed = 130,
        acceleration = 5.3f,
        horsepower = 335,
        torque = 331,
        wheelbase = 126.4f,
        curbWeight = 4270,
        dimensions = Dimensions(length = 207, width = 75, height = 58),
        cargoCapacity = 18.2f,
        seatingCapacity = "5",
        feature = listOf(
            "Executive Lounge Seating",
            "Bowers & Wilkins Diamond Surround Sound System",
            "Rear-Seat Entertainment Professional",
            "Panoramic Sky Lounge LED Roof",
            "Gesture Control",
            "Parking Assistant",
            "Remote Control Parking",
            "Night Vision with Pedestrian Detection",
            "Soft-Close Automatic Doors"
        )
    )

    private val BMW_6 = Car(
        id = "b6",
        make = "BMW",
        model = "4 Series",
        year = 2022,
        price = 45600,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 26, highway = 34),
        topSpeed = 155,
        acceleration = 5.3f,
        horsepower = 255,
        torque = 295,
        wheelbase = 112.2f,
        curbWeight = 3707,
        dimensions = Dimensions(length = 188, width = 72, height = 54),
        cargoCapacity = 12.0f,
        seatingCapacity = "4",
        feature = listOf(
            "Live Cockpit Professional",
            "Adaptive M Suspension",
            "M Sport Brakes",
            "Apple CarPlay/Android Auto",
            "Full LED Lights",
            "Comfort Access Keyless Entry",
            "Aerodynamic Kit",
            "Ambient Lighting",
            "Connected Package Professional",
            "Active Blind Spot Detection"
        )
    )

    private val BMW_7 = Car(
        id = "b7",
        make = "BMW",
        model = "X1",
        year = 2022,
        price = 35400,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 24, highway = 33),
        topSpeed = 131,
        acceleration = 6.3f,
        horsepower = 228,
        torque = 258,
        wheelbase = 105.1f,
        curbWeight = 3554,
        dimensions = Dimensions(length = 175, width = 72, height = 63),
        cargoCapacity = 27.1f,
        seatingCapacity = "5",
        feature = listOf(
            "Navigation Business",
            "Convenience Package",
            "Panoramic Moonroof",
            "Apple CarPlay/Android Auto",
            "Parking Assistant",
            "LED Headlights with Cornering Lights",
            "Dynamic Cruise Control",
            "Ambient Lighting",
            "ConnectedDrive Services",
            "Heated Front Seats"
        )
    )

    private val BMW_8 = Car(
        id = "b8",
        make = "BMW",
        model = "X7",
        year = 2022,
        price = 74900,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 19, highway = 24),
        topSpeed = 130,
        acceleration = 5.4f,
        horsepower = 335,
        torque = 330,
        wheelbase = 122.2f,
        curbWeight = 5370,
        dimensions = Dimensions(length = 203, width = 79, height = 71),
        cargoCapacity = 48.6f,
        seatingCapacity = "6-7",
        feature = listOf(
            "BMW Individual Full Merino Leather Upholstery",
            "Executive Package",
            "Rear Comfort Seats",
            "BMW Live Cockpit Professional",
            "Harman Kardon Surround Sound System",
            "Parking Assistant Plus",
            "Panoramic Sky Lounge LED Roof",
            "Comfort Access Keyless Entry",
            "Automatic 4-Zone Climate Control"
        )
    )

    private val BMW_9 = Car(
        id = "b9",
        make = "BMW",
        model = "2 Series",
        year = 2022,
        price = 35900,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 24, highway = 33),
        topSpeed = 155,
        acceleration = 5.5f,
        horsepower = 248,
        torque = 258,
        wheelbase = 105.9f,
        curbWeight = 3500,
        dimensions = Dimensions(length = 174, width = 70, height = 55),
        cargoCapacity = 13.8f,
        seatingCapacity = "4",
        feature = listOf(
            "Sport Seats",
            "iDrive 7.0 System",
            "Connected Package Plus",
            "Apple CarPlay/Android Auto",
            "LED Headlights",
            "Park Distance Control",
            "Dynamic Stability Control",
            "Automatic Emergency Braking",
            "Tire Pressure Monitor"
        )
    )

    private val BMW_10 = Car(
        id = "b10",
        make = "BMW",
        model = "iX3",
        year = 2022,
        price = null,
        bodyType = BodyType.SUV,
        fuelType = FuelType.ELECTRIC,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Electric,
        fuelEfficiency = null,
        topSpeed = 112,
        acceleration = 6.8f,
        horsepower = 286,
        torque = null,
        wheelbase = 112.8f,
        curbWeight = 4630,
        dimensions = Dimensions(length = 186, width = 74, height = 66),
        cargoCapacity = 54.7f,
        seatingCapacity = "5",
        feature = listOf(
            "Electric Powertrain",
            "Adaptive Suspension",
            "BMW Live Cockpit Professional",
            "Panoramic Sunroof",
            "Apple CarPlay/Android Auto",
            "Parking Assistance Package",
            "Harman Kardon Surround Sound System",
            "Active Driving Assistant",
            "Wireless Charging"
        )
    )

    private val BMW_11 = Car(
        id = "b11",
        make = "BMW",
        model = "i4",
        year = 2022,
        price = null,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.ELECTRIC,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Electric,
        fuelEfficiency = null,
        topSpeed = 118,
        acceleration = 5.5f,
        horsepower = 335,
        torque = null,
        wheelbase = 112.7f,
        curbWeight = 4330,
        dimensions = Dimensions(length = 188, width = 73, height = 57),
        cargoCapacity = 14.3f,
        seatingCapacity = "5",
        feature = listOf(
            "Electric Powertrain",
            "iDrive 8.0 System",
            "Sunroof",
            "Apple CarPlay/Android Auto",
            "Driver Assistance Professional",
            "Parking Assistance Package",
            "BMW Intelligent Personal Assistant",
            "Gesture Control",
            "Active Cruise Control with Stop & Go"
        )
    )

    private val BMW_12 = Car(
        id = "b12",
        make = "BMW",
        model = "M3",
        year = 2022,
        price = 70000,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 16, highway = 23),
        topSpeed = 180,
        acceleration = 4.1f,
        horsepower = 473,
        torque = 406,
        wheelbase = 112.5f,
        curbWeight = 3830,
        dimensions = Dimensions(length = 189, width = 75, height = 56),
        cargoCapacity = 13.0f,
        seatingCapacity = "5",
        feature = listOf(
            "M xDrive",
            "M Sport Differential",
            "M Compound Brakes",
            "Live Cockpit Professional",
            "Apple CarPlay/Android Auto",
            "Adaptive LED Headlights",
            "M Sports Exhaust System",
            "Parking Assistant Plus",
            "Harman Kardon Surround Sound System",
            "Lane Departure Warning"
        )
    )

    private val BMW_13 = Car(
        id = "b13",
        make = "BMW",
        model = "M5",
        year = 2022,
        price = 104495,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 4.4f),
        fuelEfficiency = FuelEfficiencyMPG(city = 15, highway = 21),
        topSpeed = 189,
        acceleration = 3.2f,
        horsepower = 600,
        torque = 553,
        wheelbase = 117.4f,
        curbWeight = 4370,
        dimensions = Dimensions(length = 195, width = 74, height = 58),
        cargoCapacity = 18.7f,
        seatingCapacity = "5",
        feature = listOf(
            "M xDrive",
            "M Sport Exhaust System",
            "Executive Package",
            "Live Cockpit Professional",
            "Apple CarPlay/Android Auto",
            "Bowers & Wilkins Diamond Surround Sound System",
            "Driving Assistance Professional",
            "M Carbon Ceramic Brakes",
            "Adaptive Cruise Control",
            "Gesture Control"
        )
    )

    private val BMW_14 = Car(
        id = "b14",
        make = "BMW",
        model = "X6 M",
        year = 2022,
        price = 108600,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 4.4f),
        fuelEfficiency = FuelEfficiencyMPG(city = 13, highway = 18),
        topSpeed = 177,
        acceleration = 3.8f,
        horsepower = 600,
        torque = 553,
        wheelbase = 117.1f,
        curbWeight = 5370,
        dimensions = Dimensions(length = 198, width = 79, height = 66),
        cargoCapacity = 27.4f,
        seatingCapacity = "5",
        feature = listOf(
            "M xDrive",
            "M Sport Differential",
            "M Compound Brakes",
            "Live Cockpit Professional",
            "Apple CarPlay/Android Auto",
            "Bowers & Wilkins Diamond Surround Sound System",
            "Driving Assistance Professional",
            "Soft-Close Automatic Doors",
            "Ambient Lighting",
            "Panoramic Moonroof"
        )
    )

    private val BMW_15 = Car(
        id = "b15",
        make = "BMW",
        model = "8 Series",
        year = 2022,
        price = 86800,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 18, highway = 25),
        topSpeed = 155,
        acceleration = 3.8f,
        horsepower = 335,
        torque = 368,
        wheelbase = 111.1f,
        curbWeight = 4340,
        dimensions = Dimensions(length = 191, width = 75, height = 53),
        cargoCapacity = 14.8f,
        seatingCapacity = "4",
        feature = listOf(
            "M Sport Brakes",
            "Live Cockpit Professional",
            "Apple CarPlay/Android Auto",
            "Harman Kardon Surround Sound System",
            "Driving Assistance Package",
            "Soft-Close Automatic Doors",
            "Parking Assistant Plus",
            "Ambient Air Package",
            "Wireless Charging"
        )
    )

    val list: List<Car> = listOf(BMW_1, BMW_2, BMW_3, BMW_4, BMW_5, BMW_6, BMW_7, BMW_8, BMW_9, BMW_10, BMW_11, BMW_12, BMW_13, BMW_14, BMW_15)
}
