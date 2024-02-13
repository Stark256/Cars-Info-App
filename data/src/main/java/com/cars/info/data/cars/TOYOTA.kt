package com.cars.info.data.cars

import com.cars.info.data.models.car.BodyType
import com.cars.info.data.models.car.Car
import com.cars.info.data.models.car.Dimensions
import com.cars.info.data.models.car.EngineDisplacement
import com.cars.info.data.models.car.FuelEfficiencyMPG
import com.cars.info.data.models.car.FuelType
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.car.TransmissionType

object TOYOTA {

    private val TOYOTA_1 = Car(
        id = "t1",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/camry-hybrid/2021/oem/2021_toyota_camry-hybrid_sedan_xse_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_2 = Car(
        id = "t2",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/rav4/2022/ns/2022_toyota_rav4_actf34_ns_111721_1600.jpg"
    )

    private val TOYOTA_3 = Car(
        id = "t3",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/corolla/2022/oem/2022_toyota_corolla_sedan_le_fq_oem_1_1280.jpg"
    )

    private val TOYOTA_4 = Car(
        id = "t4",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/highlander-hybrid/2022/oem/2022_toyota_highlander-hybrid_4dr-suv_bronze-edition_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_5 = Car(
        id = "t5",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/tacoma/2022/oem/2022_toyota_tacoma_crew-cab-pickup_trd-pro_fq_oem_1_1280.jpg"
    )

    private val TOYOTA_6 = Car(
        id = "t6",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/sienna/2022/oem/2022_toyota_sienna_passenger-minivan_le-8-passenger_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_7 = Car(
        id = "t7",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/prius/2019/oem/2019_toyota_prius_4dr-hatchback_l-eco_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_8 = Car(
        id = "t8",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/4runner/2022/oem/2022_toyota_4runner_4dr-suv_limited_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_9 = Car(
        id = "t9",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/c-hr/2022/oem/2022_toyota_c-hr_4dr-suv_limited_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_10 = Car(
        id = "t10",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/avalon-hybrid/2019/oem/2019_toyota_avalon-hybrid_sedan_limited_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_11 = Car(
        id = "t11",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://cdn.motor1.com/images/mgl/R0lG3/s1/2022-toyota-land-cruiser.jpg"
    )

    private val TOYOTA_12 = Car(
        id = "t12",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/gr-supra/2022/oem/2022_toyota_gr-supra_coupe_20_fq_oem_1_1600.jpg"
    )

    private val TOYOTA_13 = Car(
        id = "t13",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://www.topgear.com/sites/default/files/2022/06/1-Toyota-Yaris.jpg"
    )

    private val TOYOTA_14 = Car(
        id = "t14",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://www.slashgear.com/img/gallery/2022-toyota-prius-prime-review/l-intro-1645740293.jpg"
    )

    private val TOYOTA_15 = Car(
        id = "t15",
        make = Make.TOYOTA,
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/toyota/prius-c/2016/oem/2016_toyota_prius-c_4dr-hatchback_four_fq_oem_1_1600.jpg"
    )

    val list = listOf(
        TOYOTA_1, TOYOTA_2, TOYOTA_3, TOYOTA_4, TOYOTA_5, TOYOTA_6, TOYOTA_7, TOYOTA_8, TOYOTA_9, TOYOTA_10, TOYOTA_11, TOYOTA_12, TOYOTA_13, TOYOTA_14, TOYOTA_15
    )
}

/*

Toyota Camry 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fcamry-hybrid%2F2021%2Foem%2F2021_toyota_camry-hybrid_sedan_xse_fq_oem_1_1600.jpg&tbnid=c3rE3eTVPYBv8M&vet=12ahUKEwjc7Lme2oiEAxWB1ckDHTP_Du0QMygAegQIARBO..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fcamry-hybrid%2F2022%2F&docid=-zc_MC8LT12lUM&w=1600&h=1067&q=Toyota%20Camry%202022&ved=2ahUKEwjc7Lme2oiEAxWB1ckDHTP_Du0QMygAegQIARBO
Toyota RAV4 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Frav4%2F2022%2Fns%2F2022_toyota_rav4_actf34_ns_111721_1600.jpg&tbnid=4B0D9DJPuoNqJM&vet=12ahUKEwj9_tal2oiEAxWYN94AHfOhDCIQMygOegQIARBm..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fcar-news%2Ftoyota-rav4-whats-new-for-2022.html&docid=PGJoNO6s63FQiM&w=1600&h=1067&q=Toyota%20RAV4%202022&ved=2ahUKEwj9_tal2oiEAxWYN94AHfOhDCIQMygOegQIARBm
Toyota Corolla 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fcorolla%2F2022%2Foem%2F2022_toyota_corolla_sedan_le_fq_oem_1_1280.jpg&tbnid=xE7a-v16YoWASM&vet=12ahUKEwj4rYCu2oiEAxX1wckDHa4_DEEQMygDegQIARBY..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fcorolla%2F2022%2F&docid=kDfjVG-GwFLdtM&w=1280&h=855&q=Toyota%20Corolla%202022&ved=2ahUKEwj4rYCu2oiEAxX1wckDHa4_DEEQMygDegQIARBY
Toyota Highlander 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fhighlander-hybrid%2F2022%2Foem%2F2022_toyota_highlander-hybrid_4dr-suv_bronze-edition_fq_oem_1_1600.jpg&tbnid=678hIcihdOt31M&vet=12ahUKEwixoZi22oiEAxUJzskDHVHmBAQQMygCegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fhighlander-hybrid%2F2022%2F&docid=ePYyXCslJB1EkM&w=1600&h=1067&q=Toyota%20Highlander%202022&ved=2ahUKEwixoZi22oiEAxUJzskDHVHmBAQQMygCegQIARBV
Toyota Tacoma 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Ftacoma%2F2022%2Foem%2F2022_toyota_tacoma_crew-cab-pickup_trd-pro_fq_oem_1_1280.jpg&tbnid=-Gqjz7sIvLJdHM&vet=12ahUKEwjH-Oe92oiEAxUQ3ckDHQNuAygQMygAegQIARBR..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Ftacoma%2F2022%2F&docid=hQFthRZ-i390hM&w=1280&h=855&q=Toyota%20Tacoma%202022&ved=2ahUKEwjH-Oe92oiEAxUQ3ckDHQNuAygQMygAegQIARBR
Toyota Sienna 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fsienna%2F2022%2Foem%2F2022_toyota_sienna_passenger-minivan_le-8-passenger_fq_oem_1_1600.jpg&tbnid=HoLVcljc5TN3HM&vet=12ahUKEwiZg9vF2oiEAxWxyMkDHYHSBsEQMygCegQIARBQ..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fsienna%2F2022%2F&docid=LJiXEEgLl29l7M&w=1600&h=1067&q=Toyota%20Sienna%202022&ved=2ahUKEwiZg9vF2oiEAxWxyMkDHYHSBsEQMygCegQIARBQ
Toyota Prius 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fprius%2F2019%2Foem%2F2019_toyota_prius_4dr-hatchback_l-eco_fq_oem_1_1600.jpg&tbnid=iAT_ktJ6A7enWM&vet=12ahUKEwiUuMXM2oiEAxVr2ckDHW4NCcsQMygCegQIARBa..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fprius%2F2022%2F&docid=i8TnO-NGc0z99M&w=1600&h=1067&q=Toyota%20Prius%202022&ved=2ahUKEwiUuMXM2oiEAxVr2ckDHW4NCcsQMygCegQIARBa
Toyota 4Runner 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2F4runner%2F2022%2Foem%2F2022_toyota_4runner_4dr-suv_limited_fq_oem_1_1600.jpg&tbnid=qveolmlgakIAQM&vet=12ahUKEwjz6rzT2oiEAxWGzMkDHVjHABgQMygBegQIARBO..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2F4runner%2F2022%2F&docid=W0yuzoGth5DyvM&w=1600&h=1067&q=Toyota%204Runner%202022&ved=2ahUKEwjz6rzT2oiEAxWGzMkDHVjHABgQMygBegQIARBO
Toyota C-HR 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fc-hr%2F2022%2Foem%2F2022_toyota_c-hr_4dr-suv_limited_fq_oem_1_1600.jpg&tbnid=p3ZIzyMR2M4VZM&vet=12ahUKEwivjs7a2oiEAxXyxMkDHcmGDAAQMygAegQIARBY..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fc-hr%2F&docid=g7f0nZ1CpFNPOM&w=1600&h=1067&q=Toyota%20C-HR%202022&ved=2ahUKEwivjs7a2oiEAxXyxMkDHcmGDAAQMygAegQIARBY
Toyota Avalon  2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Favalon-hybrid%2F2019%2Foem%2F2019_toyota_avalon-hybrid_sedan_limited_fq_oem_1_1600.jpg&tbnid=NemjKKigfK9DzM&vet=12ahUKEwj9xKTi2oiEAxXmxckDHQ7cBxgQMygHegQIARBg..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Favalon-hybrid%2F&docid=i6WL6HWRzxa7yM&w=1600&h=1067&q=Toyota%20Avalon%20%202022&ved=2ahUKEwj9xKTi2oiEAxXmxckDHQ7cBxgQMygHegQIARBg
Toyota Land Cruiser 2022 // 1920x1080 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.motor1.com%2Fimages%2Fmgl%2FR0lG3%2Fs1%2F2022-toyota-land-cruiser.jpg&tbnid=bq8TU6yEMs_itM&vet=12ahUKEwjt-Ojq2oiEAxX8xMkDHWJxA4gQMygAegQIARBU..i&imgrefurl=https%3A%2F%2Fwww.motor1.com%2Fnews%2F521995%2F2022-toyota-land-cruiser-resale-forbidden%2F&docid=jsVsQxfjCwT_YM&w=1920&h=1080&q=Toyota%20Land%20Cruiser%202022&ved=2ahUKEwjt-Ojq2oiEAxX8xMkDHWJxA4gQMygAegQIARBU
Toyota Supra 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fgr-supra%2F2022%2Foem%2F2022_toyota_gr-supra_coupe_20_fq_oem_1_1600.jpg&tbnid=rlUHdofi3UnyiM&vet=12ahUKEwjrjJr12oiEAxV4xskDHd9qDiUQMygFegQIARBg..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fgr-supra%2F2022%2F&docid=XOU69aSF7Hcv4M&w=1600&h=1067&q=Toyota%20Supra%202022&ved=2ahUKEwjrjJr12oiEAxV4xskDHd9qDiUQMygFegQIARBg
Toyota Yaris 2022 // 1574x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.topgear.com%2Fsites%2Fdefault%2Ffiles%2F2022%2F06%2F1-Toyota-Yaris.jpg&tbnid=9Yf3hRcYukmuUM&vet=12ahUKEwj38Pz72oiEAxWxyMkDHYHSBsEQMygBegQIARBU..i&imgrefurl=https%3A%2F%2Fwww.topgear.com%2Fcar-reviews%2Ftoyota%2Fyaris&docid=PSB_BPNQRdD1pM&w=1574&h=885&q=Toyota%20Yaris%202022&ved=2ahUKEwj38Pz72oiEAxWxyMkDHYHSBsEQMygBegQIARBU
Toyota Prius Prime 2022 // 1600x901 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.slashgear.com%2Fimg%2Fgallery%2F2022-toyota-prius-prime-review%2Fl-intro-1645740293.jpg&tbnid=OvBY_jMsV4oHqM&vet=12ahUKEwjm--GH24iEAxU818kDHfEaAPUQMygDegQIARBd..i&imgrefurl=https%3A%2F%2Fwww.slashgear.com%2F779473%2F2022-toyota-prius-prime-review%2F&docid=2dKQWXG-z1H2ZM&w=1600&h=901&q=Toyota%20Prius%20Prime%202022&ved=2ahUKEwjm--GH24iEAxU818kDHfEaAPUQMygDegQIARBd
Toyota Prius c 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Ftoyota%2Fprius-c%2F2016%2Foem%2F2016_toyota_prius-c_4dr-hatchback_four_fq_oem_1_1600.jpg&tbnid=wrgPqXaovKYGHM&vet=12ahUKEwiJybWV24iEAxVjzskDHTgWDEkQMygMegQIARBw..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Ftoyota%2Fprius-c%2F2016%2Freview%2F&docid=KlBoD8EduUs7CM&w=1600&h=1067&q=Toyota%20Prius%20c%202022&ved=2ahUKEwiJybWV24iEAxVjzskDHTgWDEkQMygMegQIARBw

 */
