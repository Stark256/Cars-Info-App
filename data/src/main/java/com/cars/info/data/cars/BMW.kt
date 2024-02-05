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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/3-series/2021/oem/2021_bmw_3-series_sedan_330e_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/5-series/2021/oem/2021_bmw_5-series_sedan_530e_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/x3/2022/ns/2022_bmw_x3_actf34_ns_12622_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/x5/2021/oem/2021_bmw_x5_4dr-suv_m50i_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/7-series/2021/oem/2021_bmw_7-series_sedan_750i-xdrive_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/4-series-gran-coupe/2022/oem/2022_bmw_4-series-gran-coupe_sedan_430i_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/x1/2020/oem/2020_bmw_x1_4dr-suv_xdrive28i_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://hips.hearstapps.com/hmg-prod/images/2021-bmw-alpina-xb7-mmp-1-1629487681.jpg?crop=0.865xw:0.649xh;0.0753xw,0.156xh&resize=1200:*"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/2-series/2022/oem/2022_bmw_2-series_coupe_230i_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://cdn.motor1.com/images/mgl/QjKrB/s3/bmw-ix3-2022.webp"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/i4/2022/oem/2022_bmw_i4_sedan_m50_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/m3/2022/oem/2022_bmw_m3_sedan_competition_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/m5/2021/oem/2021_bmw_m5_sedan_base_fq_oem_3_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/x6-m/2021/oem/2021_bmw_x6-m_4dr-suv_base_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/bmw/8-series-gran-coupe/2020/oem/2020_bmw_8-series-gran-coupe_sedan_840i_fq_oem_1_1600.jpg"
    )

    val list: List<Car> = listOf(BMW_1, BMW_2, BMW_3, BMW_4, BMW_5, BMW_6, BMW_7, BMW_8, BMW_9, BMW_10, BMW_11, BMW_12, BMW_13, BMW_14, BMW_15)
}
/*
BMW 3 Series 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2F3-series%2F2021%2Foem%2F2021_bmw_3-series_sedan_330e_fq_oem_1_1600.jpg&tbnid=88WhGSK1oezQhM&vet=12ahUKEwituc7X0YiEAxVax8kDHdCDBPAQMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2F3-series%2F2022%2F&docid=F6tzSb9TpFR-5M&w=1600&h=1067&q=BMW%203%20Series%202022&ved=2ahUKEwituc7X0YiEAxVax8kDHdCDBPAQMygAegQIARBT
BMW 5 Series 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2F5-series%2F2021%2Foem%2F2021_bmw_5-series_sedan_530e_fq_oem_1_1600.jpg&tbnid=iqqz3LDjHUaV0M&vet=12ahUKEwiq7PHe0YiEAxWB1ckDHTP_Du0QMygDegQIARBf..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2F5-series%2F2022%2F&docid=moDnFdVd4jZL_M&w=1600&h=1067&q=BMW%205%20Series%202022&ved=2ahUKEwiq7PHe0YiEAxWB1ckDHTP_Du0QMygDegQIARBf
BMW X3 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fx3%2F2022%2Fns%2F2022_bmw_x3_actf34_ns_12622_1600.jpg&tbnid=qkK9L3Gg2MW_CM&vet=12ahUKEwiiwoOk0oiEAxVsK9AFHU9LCiYQMygCegQIARBb..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fcar-news%2Fwhats-new-for-the-2022-bmw-x3.html&docid=wDp5m3gJQkaC7M&w=1600&h=1067&q=BMW%20X3%202022&ved=2ahUKEwiiwoOk0oiEAxVsK9AFHU9LCiYQMygCegQIARBb
BMW X5 2022 // 1280 x 855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fx5%2F2021%2Foem%2F2021_bmw_x5_4dr-suv_m50i_fq_oem_1_1280.jpg&tbnid=1lUBlIuEiqPX5M&vet=12ahUKEwi2_5zC0oiEAxXi8MkDHXpLA_AQMygFegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2Fx5%2F2022%2F&docid=zDaMWYpJuGpzTM&w=1280&h=855&q=BMW%20X5%202022%201600x1067&ved=2ahUKEwi2_5zC0oiEAxXi8MkDHXpLA_AQMygFegQIARBd
BMW 7 Series 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2F7-series%2F2021%2Foem%2F2021_bmw_7-series_sedan_750i-xdrive_fq_oem_1_1600.jpg&tbnid=JWLhbHEZnB4oCM&vet=12ahUKEwj26pPb0oiEAxUR2ckDHVYhBegQMygGegQIARBf..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2F7-series%2F2022%2Fm760i-xdrive%2F&docid=98dO8QFfEN-ptM&w=1600&h=1067&q=BMW%207%20Series%202022&ved=2ahUKEwj26pPb0oiEAxUR2ckDHVYhBegQMygGegQIARBf
BMW 4 Series 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2F4-series-gran-coupe%2F2022%2Foem%2F2022_bmw_4-series-gran-coupe_sedan_430i_fq_oem_1_1600.jpg&tbnid=z5m_H9Dx6mVLEM&vet=12ahUKEwio7d_u0oiEAxWM6skDHVLHCFAQMygHegQIARBg..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2F4-series-gran-coupe%2F2022%2F&docid=NBQpBbVGiqIj9M&w=1600&h=1067&q=BMW%204%20Series%202022&ved=2ahUKEwio7d_u0oiEAxWM6skDHVLHCFAQMygHegQIARBg
BMW X1 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fx1%2F2020%2Foem%2F2020_bmw_x1_4dr-suv_xdrive28i_fq_oem_1_1600.jpg&tbnid=8FjY9Re7t4SJkM&vet=12ahUKEwiC79__0oiEAxXy0MkDHS8XBwMQMygBegQIARBR..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2Fx1%2F2022%2F&docid=XI4lVKx74-M3QM&w=1600&h=1067&q=BMW%20X1%202022&ved=2ahUKEwiC79__0oiEAxXy0MkDHS8XBwMQMygBegQIARBR
BMW X7 2022 // 1200 x 600 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fhips.hearstapps.com%2Fhmg-prod%2Fimages%2F2021-bmw-alpina-xb7-mmp-1-1629487681.jpg%3Fcrop%3D0.865xw%3A0.649xh%3B0.0753xw%2C0.156xh%26resize%3D1200%3A*&tbnid=huHZzPAGrVkDcM&vet=12ahUKEwia4fim04iEAxXIzMkDHZTHBKUQMygBegQIARBa..i&imgrefurl=https%3A%2F%2Fwww.caranddriver.com%2Fbmw%2Fx7-2022&docid=8gmY0sdfPQaRgM&w=1200&h=600&q=BMW%20X7%202022%201600x1067&ved=2ahUKEwia4fim04iEAxXIzMkDHZTHBKUQMygBegQIARBa
BMW 2 Series 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2F2-series%2F2022%2Foem%2F2022_bmw_2-series_coupe_230i_fq_oem_1_1600.jpg&tbnid=b8Qaso0O9ooP8M&vet=12ahUKEwjl26y304iEAxVzxckDHcMXBlsQMygAegQIARBU..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2F2-series%2F2022%2F&docid=kZHAGNp6F0OdsM&w=1600&h=1067&q=BMW%202%20Series%202022&ved=2ahUKEwjl26y304iEAxVzxckDHcMXBlsQMygAegQIARBU
BMW iX3 2022 // 1280 x 720 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.motor1.com%2Fimages%2Fmgl%2FQjKrB%2Fs3%2Fbmw-ix3-2022.webp&tbnid=LkAOKhqp3q7lbM&vet=12ahUKEwjZlozF04iEAxU1Nt4AHfdUDXQQMygCegQIARBX..i&imgrefurl=https%3A%2F%2Fwww.motor1.com%2Fnews%2F525853%2F2022-bmw-ix3-facelift-specs-photos%2F&docid=STBqRymUXKFXQM&w=1280&h=720&q=BMW%20iX3%202022&ved=2ahUKEwjZlozF04iEAxU1Nt4AHfdUDXQQMygCegQIARBX
BMW i4 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fi4%2F2022%2Foem%2F2022_bmw_i4_sedan_m50_fq_oem_1_1600.jpg&tbnid=BNIcfeP7td5PiM&vet=12ahUKEwjT0tTb04iEAxUcyMkDHbDMANwQMygEegQIARBc..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2Fi4%2F2022%2Fm50%2F&docid=4uMzmj-iAdHuCM&w=1600&h=1067&q=BMW%20i4%202022&ved=2ahUKEwjT0tTb04iEAxUcyMkDHbDMANwQMygEegQIARBc
BMW M3 2022 // 1280 x 855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fm3%2F2022%2Foem%2F2022_bmw_m3_sedan_competition_fq_oem_1_1280.jpg&tbnid=-Nh8CfVXbf4deM&vet=12ahUKEwjhn83o04iEAxVA0ckDHfmuDWkQMygAegQIARBR..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2Fm3%2F2022%2F&docid=1uBKCKA8F0sqnM&w=1280&h=855&q=BMW%20M3%202022&ved=2ahUKEwjhn83o04iEAxVA0ckDHfmuDWkQMygAegQIARBR
BMW M5 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fm5%2F2021%2Foem%2F2021_bmw_m5_sedan_base_fq_oem_3_1600.jpg&tbnid=2YqFS5bWHdjWzM&vet=12ahUKEwjYwpCG1IiEAxVi8ckDHdPIDnkQMygDegQIARBb..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2Fm5%2F2022%2F&docid=FIZ3optSHV7kKM&w=1600&h=1067&q=BMW%20M5%202022&ved=2ahUKEwjYwpCG1IiEAxVi8ckDHdPIDnkQMygDegQIARBb
BMW X6 M 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2Fx6-m%2F2021%2Foem%2F2021_bmw_x6-m_4dr-suv_base_fq_oem_1_1600.jpg&tbnid=fFlHLGFlLiR1NM&vet=12ahUKEwi-pM6P1IiEAxXnHdAFHQQvAS8QMygCegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2Fx6-m%2F2022%2F&docid=Kh3FbuYPr1OnLM&w=1600&h=1067&q=BMW%20X6%20M%202022&ved=2ahUKEwi-pM6P1IiEAxXnHdAFHQQvAS8QMygCegQIARBd
BMW 8 Series 2022 // 1600 x 1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fbmw%2F8-series-gran-coupe%2F2020%2Foem%2F2020_bmw_8-series-gran-coupe_sedan_840i_fq_oem_1_1600.jpg&tbnid=ZDxlCOoG0H06TM&vet=12ahUKEwjr26KZ1IiEAxVpyMkDHYwyChsQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fbmw%2F8-series-gran-coupe%2F2022%2F&docid=zqLTwXS26fSBIM&w=1600&h=1067&q=BMW%208%20Series%202022&ved=2ahUKEwjr26KZ1IiEAxVpyMkDHYwyChsQMygBegQIARBZ

 */