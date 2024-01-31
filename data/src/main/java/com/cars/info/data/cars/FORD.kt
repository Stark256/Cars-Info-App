package com.cars.info.data.cars

import com.cars.info.data.models.BodyType
import com.cars.info.data.models.Car
import com.cars.info.data.models.Dimensions
import com.cars.info.data.models.EngineDisplacement
import com.cars.info.data.models.FuelEfficiencyMPG
import com.cars.info.data.models.FuelType
import com.cars.info.data.models.TransmissionType

object FORD {

    private val FORD_1 = Car(
        id = "f1",
        make = "Ford",
        model = "F-150",
        year = 2022,
        price = 28940,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 20, highway = 24),
        topSpeed = 107,
        acceleration = 5.7f,
        horsepower = 400,
        torque = 500,
        wheelbase = 145.4f,
        curbWeight = 4051,
        dimensions = Dimensions(length = 227, width = 80, height = 77),
        cargoCapacity = null,
        seatingCapacity = "5-6",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 4 with 12-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "Pro Power Onboard",
            "FordPass™ Connect",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking",
            "Rear View Camera"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Ff-150%2F2021%2Foem%2F2021_ford_f-150_crew-cab-pickup_king-ranch_fq_oem_1_1600.jpg&tbnid=rnsKu521q6OT1M&vet=12ahUKEwjw9qmT14iEAxW0z8kDHRcXB_0QMygAegQIARBX..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Ff-150%2F2022%2F&docid=yS70g-thGOXPKM&w=1600&h=1067&q=Ford%20F-150%202022&ved=2ahUKEwjw9qmT14iEAxW0z8kDHRcXB_0QMygAegQIARBX"
    )

    private val FORD_2 = Car(
        id = "f2",
        make = "Ford",
        model = "Escape",
        year = 2022,
        price = 24885,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 28, highway = 34),
        topSpeed = 130,
        acceleration = 8.3f,
        horsepower = 121,
        torque = 190,
        wheelbase = 106.7f,
        curbWeight = 3298,
        dimensions = Dimensions(length = 181, width = 74, height = 66),
        cargoCapacity = 37.5f,
        seatingCapacity = "5",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Blind Spot Information System",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.autotrader.com%2Fwp-content%2Fuploads%2F2021%2F09%2F2022-ford-escape-front-right.jpg&tbnid=3dcquTgJYsKspM&vet=12ahUKEwicv_eb14iEAxWB18kDHXDQDHsQMygCegQIARBW..i&imgrefurl=https%3A%2F%2Fwww.autotrader.com%2Fcomparisons%2F2022-ford-escape-choosing-the-right-trim&docid=XypRuVnSps7wjM&w=1600&h=900&q=Ford%20Escape%202022&ved=2ahUKEwicv_eb14iEAxWB18kDHXDQDHsQMygCegQIARBW"
    )

    private val FORD_3 = Car(
        id = "f3",
        make = "Ford",
        model = "Explorer",
        year = 2022,
        price = 32225,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.3f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 28),
        topSpeed = 143,
        acceleration = 6.7f,
        horsepower = 300,
        torque = 310,
        wheelbase = 119.1f,
        curbWeight = 4345,
        dimensions = Dimensions(length = 199, width = 79, height = 69),
        cargoCapacity = 18.2f,
        seatingCapacity = "6-7",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 4 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Terrain Management System™",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking",
            "Rear View Camera"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fexplorer%2F2021%2Foem%2F2021_ford_explorer_4dr-suv_limited-hybrid_fq_oem_1_1280.jpg&tbnid=Ob-3I93ykDvCVM&vet=12ahUKEwjHrM6p14iEAxWY0ckDHVJFCUAQMygJegQIARBn..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fexplorer%2F2022%2Fhybrid%2F&docid=zkoV7oB5F7tNZM&w=1280&h=855&q=Ford%20Explorer%202022&ved=2ahUKEwjHrM6p14iEAxWY0ckDHVJFCUAQMygJegQIARBn"
    )

    private val FORD_4 = Car(
        id = "f4",
        make = "Ford",
        model = "Mustang",
        year = 2022,
        price = 27205,
        bodyType = BodyType.COUPE,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.3f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 32),
        topSpeed = 145,
        acceleration = 5.3f,
        horsepower = 310,
        torque = 350,
        wheelbase = 107.1f,
        curbWeight = 3629,
        dimensions = Dimensions(length = 188, width = 75, height = 54),
        cargoCapacity = 13.5f,
        seatingCapacity = "4",
        feature = listOf(
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Track Apps™",
            "Ford Co-Pilot360™",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fhips.hearstapps.com%2Fhmg-prod%2Fimages%2F2022-ford-mustang-stealth-edition-02-1633475393.jpg%3Fcrop%3D0.681xw%3A0.906xh%3B0.112xw%2C0%26resize%3D1200%3A*&tbnid=aPIRZG7NDoMY2M&vet=12ahUKEwirq8C114iEAxUvyMkDHW12BJgQMygAegQIARBP..i&imgrefurl=https%3A%2F%2Fwww.caranddriver.com%2Fford%2Fmustang-2022&docid=corO4ycW1LFOzM&w=1200&h=600&q=Ford%20Mustang%202022&ved=2ahUKEwirq8C114iEAxUvyMkDHW12BJgQMygAegQIARBP"
    )

    private val FORD_5 = Car(
        id = "f5",
        make = "Ford",
        model = "Edge",
        year = 2022,
        price = 32345,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 28),
        topSpeed = 130,
        acceleration = 7.6f,
        horsepower = 250,
        torque = 280,
        wheelbase = 112.2f,
        curbWeight = 3959,
        dimensions = Dimensions(length = 189, width = 76, height = 68),
        cargoCapacity = 39.2f,
        seatingCapacity = "5",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 4 with 12-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking",
            "Rear View Camera"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fedge%2F2022%2Foem%2F2022_ford_edge_4dr-suv_sel_fq_oem_1_1280.jpg&tbnid=z-MYqP1q0BX7NM&vet=12ahUKEwiKn9fA14iEAxWRyckDHRS6CF0QMygCegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fedge%2F2022%2F&docid=M6OgdsNDZ-c2cM&w=1280&h=855&q=Ford%20Edge%202022&ved=2ahUKEwiKn9fA14iEAxWRyckDHRS6CF0QMygCegQIARBV"
    )

    private val FORD_6 = Car(
        id = "f6",
        make = "Ford",
        model = "Ranger",
        year = 2022,
        price = 24820,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.3f),
        fuelEfficiency = FuelEfficiencyMPG(city = 21, highway = 26),
        topSpeed = 112,
        acceleration = 6.5f,
        horsepower = 270,
        torque = 310,
        wheelbase = 126.8f,
        curbWeight = 4441,
        dimensions = Dimensions(length = 213, width = 74, height = 72),
        cargoCapacity = null,
        seatingCapacity = "5",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Terrain Management System™",
            "Pre-Collision Assist with Automatic Emergency Braking",
            "Rear View Camera"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Franger%2F2021%2Foem%2F2021_ford_ranger_crew-cab-pickup_lariat_fq_oem_1_1600.jpg&tbnid=_EcTnXmwML6n1M&vet=12ahUKEwjygo7L14iEAxXCyckDHbE7BVUQMygDegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Franger%2F2022%2F&docid=ic6mwbQrWovArM&w=1600&h=1067&q=Ford%20Ranger%202022&ved=2ahUKEwjygo7L14iEAxXCyckDHbE7BVUQMygDegQIARBd"
    )

    private val FORD_7 = Car(
        id = "f7",
        make = "Ford",
        model = "Fusion",
        year = 2022,
        price = 23170,
        bodyType = BodyType.SEDAN,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 23, highway = 34),
        topSpeed = 129,
        acceleration = 7.3f,
        horsepower = 245,
        torque = 275,
        wheelbase = 112.2f,
        curbWeight = 3472,
        dimensions = Dimensions(length = 192, width = 74, height = 58),
        cargoCapacity = 16.0f,
        seatingCapacity = "5",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking",
            "Rear View Camera"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.motor1.com%2Fimages%2Fmgl%2FeJOrM%2Fs3%2F2022-ford-fusion-mondeo-successor-rendering.jpg&tbnid=kz-J86litVIH_M&vet=12ahUKEwi1vuPT14iEAxWtyMkDHSaABsAQMygEegQIARBY..i&imgrefurl=https%3A%2F%2Fwww.motor1.com%2Fnews%2F445761%2Fford-fusion-mondeo-rendering%2F&docid=FXHMfG59GVavJM&w=1280&h=720&q=Ford%20Fusion%202022&ved=2ahUKEwi1vuPT14iEAxWtyMkDHSaABsAQMygEegQIARBY"
    )

    private val FORD_8 = Car(
        id = "f8",
        make = "Ford",
        model = "Bronco Sport",
        year = 2022,
        price = 28315,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 1.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 25, highway = 28),
        topSpeed = 120,
        acceleration = 8.4f,
        horsepower = 181,
        torque = 190,
        wheelbase = 105.1f,
        curbWeight = 3448,
        dimensions = Dimensions(length = 172, width = 73, height = 71),
        cargoCapacity = 32.5f,
        seatingCapacity = "5",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "G.O.A.T. Modes™",
            "Terrain Management System™",
            "Pre-Collision Assist with Automatic Emergency Braking"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.motortrend.com%2Fuploads%2F2021%2F12%2F2022-Ford-Bronco-Sport-Outer-Banks-26.jpg&tbnid=FMb70DZ7xfIdnM&vet=12ahUKEwje-PLi14iEAxXbwskDHSt8DgUQMygAegQIARBW..i&imgrefurl=https%3A%2F%2Fwww.motortrend.com%2Fcars%2Fford%2Fbronco-sport%2F2022%2F&docid=vJKTgUDndJsabM&w=1920&h=1080&q=Ford%20Bronco%20Sport%202022&ved=2ahUKEwje-PLi14iEAxXbwskDHSt8DgUQMygAegQIARBW"
    )

    private val FORD_9 = Car(
        id = "f9",
        make = "Ford",
        model = "EcoSport",
        year = 2022,
        price = 20995,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.0f),
        fuelEfficiency = FuelEfficiencyMPG(city = 27, highway = 29),
        topSpeed = 115,
        acceleration = 10.2f,
        horsepower = 166,
        torque = 149,
        wheelbase = 99.2f,
        curbWeight = 3021,
        dimensions = Dimensions(length = 166, width = 71, height = 66),
        cargoCapacity = 20.9f,
        seatingCapacity = "5",
        feature = listOf(
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Ford Co-Pilot360™",
            "Rear View Camera"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fecosport%2F2022%2Foem%2F2022_ford_ecosport_4dr-suv_titanium_fq_oem_1_1600.jpg&tbnid=DFSYbFBQY3ymFM&vet=12ahUKEwiSxMrw14iEAxUmxckDHVNmCu8QMygAegQIARBY..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fecosport%2F&docid=dKBpYa09FDOlzM&w=1600&h=1067&q=Ford%20EcoSport%202022&ved=2ahUKEwiSxMrw14iEAxUmxckDHVNmCu8QMygAegQIARBY"
    )

    private val FORD_10 = Car(
        id = "f10",
        make = "Ford",
        model = "Expedition",
        year = 2022,
        price = 51290,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 17, highway = 23),
        topSpeed = 120,
        acceleration = 6.7f,
        horsepower = 400,
        torque = 480,
        wheelbase = 122.5f,
        curbWeight = 5443,
        dimensions = Dimensions(length = 221, width = 84, height = 76),
        cargoCapacity = 20.9f,
        seatingCapacity = "7-8",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 4 with 12-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Pro Trailer Backup Assist™",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fexpedition%2F2022%2Foem%2F2022_ford_expedition_4dr-suv_limited_fq_oem_1_1600.jpg&tbnid=OlIm9RGayAHEPM&vet=12ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fexpedition%2F2022%2F&docid=TUkANcWqqBUhwM&w=1600&h=1067&q=Ford%20Expedition%202022&ved=2ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV"
    )

    private val FORD_11 = Car(
        id = "f11",
        make = "Ford",
        model = "Expedition MAX",
        year = 2022,
        price = 54810,
        bodyType = BodyType.SUV,
        fuelType = FuelType.GASOLINE,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 3.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 17, highway = 23),
        topSpeed = 120,
        acceleration = 6.7f,
        horsepower = 400,
        torque = 480,
        wheelbase = 131.6f,
        curbWeight = 5701,
        dimensions = Dimensions(length = 221, width = 84, height = 76),
        cargoCapacity = 36.0f,
        seatingCapacity = "7-8",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 4 with 12-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Pro Trailer Backup Assist™",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fexpedition%2F2022%2Foem%2F2022_ford_expedition_4dr-suv_limited_fq_oem_1_1600.jpg&tbnid=OlIm9RGayAHEPM&vet=12ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fexpedition%2F2022%2F&docid=TUkANcWqqBUhwM&w=1600&h=1067&q=Ford%20Expedition%202022&ved=2ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV"
    )

    private val FORD_12 = Car(
        id = "f12",
        make = "Ford",
        model = "Maverick",
        year = 2022,
        price = 19995,
        bodyType = BodyType.TRUCK,
        fuelType = FuelType.HYBRID,
        transmissionType = TransmissionType.AUTOMATIC,
        engineDisplacement = EngineDisplacement.Value(value = 2.5f),
        fuelEfficiency = FuelEfficiencyMPG(city = 42, highway = 33),
        topSpeed = 115,
        acceleration = 9.1f,
        horsepower = 191,
        torque = 155,
        wheelbase = 121.1f,
        curbWeight = 3654,
        dimensions = Dimensions(length = 199, width = 72, height = 68),
        cargoCapacity = null,
        seatingCapacity = "5",
        feature = listOf(
            "Ford Co-Pilot360™",
            "SYNC® 3 with 8-inch Touchscreen",
            "Apple CarPlay/Android Auto",
            "FordPass™ Connect",
            "Built-In FlexBed™",
            "Lane-Keeping System",
            "Pre-Collision Assist with Automatic Emergency Braking"
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fmaverick%2F2022%2Foem%2F2022_ford_maverick_crew-cab-pickup_lariat_fq_oem_1_1600.jpg&tbnid=Am39UtK0Dmki4M&vet=12ahUKEwiox7qW2IiEAxVyNt4AHZIYB4oQMygGegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fmaverick%2F2022%2F&docid=MGGnyV6xjldGTM&w=1600&h=1067&q=Ford%20Maverick%202022&ved=2ahUKEwiox7qW2IiEAxVyNt4AHZIYB4oQMygGegQIARBd"
    )

    val list = listOf(
        FORD_1, FORD_2, FORD_3, FORD_4, FORD_5, FORD_6, FORD_7, FORD_8, FORD_9, FORD_10, FORD_11, FORD_12
    )
}

/*

Ford F-150 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Ff-150%2F2021%2Foem%2F2021_ford_f-150_crew-cab-pickup_king-ranch_fq_oem_1_1600.jpg&tbnid=rnsKu521q6OT1M&vet=12ahUKEwjw9qmT14iEAxW0z8kDHRcXB_0QMygAegQIARBX..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Ff-150%2F2022%2F&docid=yS70g-thGOXPKM&w=1600&h=1067&q=Ford%20F-150%202022&ved=2ahUKEwjw9qmT14iEAxW0z8kDHRcXB_0QMygAegQIARBX
Ford Escape 2022 // 1600x900 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.autotrader.com%2Fwp-content%2Fuploads%2F2021%2F09%2F2022-ford-escape-front-right.jpg&tbnid=3dcquTgJYsKspM&vet=12ahUKEwicv_eb14iEAxWB18kDHXDQDHsQMygCegQIARBW..i&imgrefurl=https%3A%2F%2Fwww.autotrader.com%2Fcomparisons%2F2022-ford-escape-choosing-the-right-trim&docid=XypRuVnSps7wjM&w=1600&h=900&q=Ford%20Escape%202022&ved=2ahUKEwicv_eb14iEAxWB18kDHXDQDHsQMygCegQIARBW
Ford Explorer 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fexplorer%2F2021%2Foem%2F2021_ford_explorer_4dr-suv_limited-hybrid_fq_oem_1_1280.jpg&tbnid=Ob-3I93ykDvCVM&vet=12ahUKEwjHrM6p14iEAxWY0ckDHVJFCUAQMygJegQIARBn..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fexplorer%2F2022%2Fhybrid%2F&docid=zkoV7oB5F7tNZM&w=1280&h=855&q=Ford%20Explorer%202022&ved=2ahUKEwjHrM6p14iEAxWY0ckDHVJFCUAQMygJegQIARBn
Ford Mustang 2022 // 1200x600 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fhips.hearstapps.com%2Fhmg-prod%2Fimages%2F2022-ford-mustang-stealth-edition-02-1633475393.jpg%3Fcrop%3D0.681xw%3A0.906xh%3B0.112xw%2C0%26resize%3D1200%3A*&tbnid=aPIRZG7NDoMY2M&vet=12ahUKEwirq8C114iEAxUvyMkDHW12BJgQMygAegQIARBP..i&imgrefurl=https%3A%2F%2Fwww.caranddriver.com%2Fford%2Fmustang-2022&docid=corO4ycW1LFOzM&w=1200&h=600&q=Ford%20Mustang%202022&ved=2ahUKEwirq8C114iEAxUvyMkDHW12BJgQMygAegQIARBP
Ford Edge 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fedge%2F2022%2Foem%2F2022_ford_edge_4dr-suv_sel_fq_oem_1_1280.jpg&tbnid=z-MYqP1q0BX7NM&vet=12ahUKEwiKn9fA14iEAxWRyckDHRS6CF0QMygCegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fedge%2F2022%2F&docid=M6OgdsNDZ-c2cM&w=1280&h=855&q=Ford%20Edge%202022&ved=2ahUKEwiKn9fA14iEAxWRyckDHRS6CF0QMygCegQIARBV
Ford Ranger 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Franger%2F2021%2Foem%2F2021_ford_ranger_crew-cab-pickup_lariat_fq_oem_1_1600.jpg&tbnid=_EcTnXmwML6n1M&vet=12ahUKEwjygo7L14iEAxXCyckDHbE7BVUQMygDegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Franger%2F2022%2F&docid=ic6mwbQrWovArM&w=1600&h=1067&q=Ford%20Ranger%202022&ved=2ahUKEwjygo7L14iEAxXCyckDHbE7BVUQMygDegQIARBd
Ford Fusion 2022 // 1280x720 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.motor1.com%2Fimages%2Fmgl%2FeJOrM%2Fs3%2F2022-ford-fusion-mondeo-successor-rendering.jpg&tbnid=kz-J86litVIH_M&vet=12ahUKEwi1vuPT14iEAxWtyMkDHSaABsAQMygEegQIARBY..i&imgrefurl=https%3A%2F%2Fwww.motor1.com%2Fnews%2F445761%2Fford-fusion-mondeo-rendering%2F&docid=FXHMfG59GVavJM&w=1280&h=720&q=Ford%20Fusion%202022&ved=2ahUKEwi1vuPT14iEAxWtyMkDHSaABsAQMygEegQIARBY
Ford Bronco Sport 2022 // 1920x1080 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.motortrend.com%2Fuploads%2F2021%2F12%2F2022-Ford-Bronco-Sport-Outer-Banks-26.jpg&tbnid=FMb70DZ7xfIdnM&vet=12ahUKEwje-PLi14iEAxXbwskDHSt8DgUQMygAegQIARBW..i&imgrefurl=https%3A%2F%2Fwww.motortrend.com%2Fcars%2Fford%2Fbronco-sport%2F2022%2F&docid=vJKTgUDndJsabM&w=1920&h=1080&q=Ford%20Bronco%20Sport%202022&ved=2ahUKEwje-PLi14iEAxXbwskDHSt8DgUQMygAegQIARBW
Ford EcoSport 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fecosport%2F2022%2Foem%2F2022_ford_ecosport_4dr-suv_titanium_fq_oem_1_1600.jpg&tbnid=DFSYbFBQY3ymFM&vet=12ahUKEwiSxMrw14iEAxUmxckDHVNmCu8QMygAegQIARBY..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fecosport%2F&docid=dKBpYa09FDOlzM&w=1600&h=1067&q=Ford%20EcoSport%202022&ved=2ahUKEwiSxMrw14iEAxUmxckDHVNmCu8QMygAegQIARBY
Ford Expedition 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fexpedition%2F2022%2Foem%2F2022_ford_expedition_4dr-suv_limited_fq_oem_1_1600.jpg&tbnid=OlIm9RGayAHEPM&vet=12ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fexpedition%2F2022%2F&docid=TUkANcWqqBUhwM&w=1600&h=1067&q=Ford%20Expedition%202022&ved=2ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV
Ford Expedition MAX 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fexpedition%2F2022%2Foem%2F2022_ford_expedition_4dr-suv_limited_fq_oem_1_1600.jpg&tbnid=OlIm9RGayAHEPM&vet=12ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fexpedition%2F2022%2F&docid=TUkANcWqqBUhwM&w=1600&h=1067&q=Ford%20Expedition%202022&ved=2ahUKEwjPwcn714iEAxV1G9AFHd5CBosQMygAegQIARBV
Ford Maverick 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fford%2Fmaverick%2F2022%2Foem%2F2022_ford_maverick_crew-cab-pickup_lariat_fq_oem_1_1600.jpg&tbnid=Am39UtK0Dmki4M&vet=12ahUKEwiox7qW2IiEAxVyNt4AHZIYB4oQMygGegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fford%2Fmaverick%2F2022%2F&docid=MGGnyV6xjldGTM&w=1600&h=1067&q=Ford%20Maverick%202022&ved=2ahUKEwiox7qW2IiEAxVyNt4AHZIYB4oQMygGegQIARBd

 */
