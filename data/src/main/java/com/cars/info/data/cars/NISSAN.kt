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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/altima/2020/oem/2020_nissan_altima_sedan_25-platinum_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://images.cars.com/cldstatic/wp-content/uploads/nissan-rogue-platinum-2022-01-exterior-front-angle-grey-suv-scaled.jpg"
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
        ),
        imageUrl = "https://www.cnet.com/a/img/resize/4ff3384d94ee745cda03c7b31f91ebf1366527f8/hub/2022/02/21/31147bd8-84fb-4160-b365-89d65f22d65a/2022-nissan-sentra-sr-10.jpg?auto=webp&width=1200"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/murano/2020/oem/2020_nissan_murano_4dr-suv_platinum_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/maxima/2022/oem/2022_nissan_maxima_sedan_35-sr_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/titan/2021/oem/2021_nissan_titan_crew-cab-pickup_pro-4x_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/kicks/2022/oem/2022_nissan_kicks_4dr-hatchback_sr_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/pathfinder/2022/fe/2022_nissan_pathfinder_f34_fe_527212_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/armada/2022/oem/2022_nissan_armada_4dr-suv_platinum_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Nissan_FAIRLADY_Z_%28Z34%29_Version_ST%2C_2022%2C_left-front.jpg/1200px-Nissan_FAIRLADY_Z_%28Z34%29_Version_ST%2C_2022%2C_left-front.jpg"
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
        ),
        imageUrl = "https://cdn.motor1.com/images/mgl/rMjOr/s1/2022-nissan-gt-r-nismo-special-edition.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/frontier/2022/oem/2022_nissan_frontier_extended-cab-pickup_sv_fq_oem_1_1600.jpg"
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
        ),
        imageUrl = "https://media.ed.edmunds-media.com/nissan/versa/2020/oem/2020_nissan_versa_sedan_sr_fq_oem_1_1280.jpg"
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
        ),
        imageUrl = "https://ev-database.org/img/auto/Nissan_Leaf_2022/Nissan_Leaf_2022-01@2x.jpg"
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
        ),
        imageUrl = "https://cdn-fastly.thetruthaboutcars.com/media/2022/06/30/8669752/capsule-review-2014-nissan-nv200-sv-cargo-van.jpg?size=1200x628"
    )

    val list = listOf(
        NISSAN_1, NISSAN_2, NISSAN_3, NISSAN_4, NISSAN_5, NISSAN_6, NISSAN_7, NISSAN_8, NISSAN_9, NISSAN_10, NISSAN_11, NISSAN_12, NISSAN_13, NISSAN_14, NISSAN_15
    )
}

/*

Nissan Altima 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Faltima%2F2020%2Foem%2F2020_nissan_altima_sedan_25-platinum_fq_oem_1_1280.jpg&tbnid=k6vDEcj0ZqD_7M&vet=12ahUKEwje9eKs2IiEAxXdw8kDHYsWBPAQMygAegQIARBU..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Faltima%2F2022%2F&docid=jSeG1ubdQM6s4M&w=1280&h=855&q=Nissan%20Altima%202022&ved=2ahUKEwje9eKs2IiEAxXdw8kDHYsWBPAQMygAegQIARBU
Nissan Rogue 2022 // 1200x800 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.cars.com%2Fcldstatic%2Fwp-content%2Fuploads%2Fnissan-rogue-platinum-2022-01-exterior-front-angle-grey-suv-scaled.jpg&tbnid=NcqLyfweczcwKM&vet=12ahUKEwj3-8y02IiEAxXqzMkDHe-RAZ0QMygFegQIARBf..i&imgrefurl=https%3A%2F%2Fwww.cars.com%2Farticles%2Fnissan-changes-the-heart-of-the-rogue-for-2022-443551%2F&docid=r9nIdifQ0AORfM&w=1200&h=800&q=Nissan%20Rogue%202022&ved=2ahUKEwj3-8y02IiEAxXqzMkDHe-RAZ0QMygFegQIARBf
Nissan Sentra 2022 // 1200x900 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.cnet.com%2Fa%2Fimg%2Fresize%2F4ff3384d94ee745cda03c7b31f91ebf1366527f8%2Fhub%2F2022%2F02%2F21%2F31147bd8-84fb-4160-b365-89d65f22d65a%2F2022-nissan-sentra-sr-10.jpg%3Fauto%3Dwebp%26width%3D1200&tbnid=rh42Aq0h11TjaM&vet=12ahUKEwjphrnE2IiEAxU9HdAFHY6nD2wQMygCegQIARBZ..i&imgrefurl=https%3A%2F%2Fwww.cnet.com%2Froadshow%2Freviews%2F2022-nissan-sentra-review%2F&docid=naEGoWwO-GAObM&w=1200&h=900&q=Nissan%20Sentra%202022&ved=2ahUKEwjphrnE2IiEAxU9HdAFHY6nD2wQMygCegQIARBZ
Nissan Murano 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Fmurano%2F2020%2Foem%2F2020_nissan_murano_4dr-suv_platinum_fq_oem_1_1280.jpg&tbnid=qtX9fKPII4nW6M&vet=12ahUKEwi09qHR2IiEAxU_x8kDHYOgCiwQMygKegQIARBo..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Fmurano%2F2022%2F&docid=FAP5PK0fzPmN2M&w=1280&h=855&q=Nissan%20Murano%202022&ved=2ahUKEwi09qHR2IiEAxU_x8kDHYOgCiwQMygKegQIARBo
Nissan Maxima 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Fmaxima%2F2022%2Foem%2F2022_nissan_maxima_sedan_35-sr_fq_oem_1_1280.jpg&tbnid=50OFc_4w4sd_xM&vet=12ahUKEwjHj6Db2IiEAxUYHNAFHThLAJEQMygBegQIARBb..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Fmaxima%2F2022%2F&docid=4ia7D5bI_q4wTM&w=1280&h=855&q=Nissan%20Maxima%202022&ved=2ahUKEwjHj6Db2IiEAxUYHNAFHThLAJEQMygBegQIARBb
Nissan Titan 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Ftitan%2F2021%2Foem%2F2021_nissan_titan_crew-cab-pickup_pro-4x_fq_oem_1_1280.jpg&tbnid=zk1H6X8I3nAp3M&vet=12ahUKEwjNtrXi2IiEAxXA1ckDHQdFD2wQMygBegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Ftitan%2F2022%2F&docid=Lb9_ubgKJMrPxM&w=1280&h=855&q=Nissan%20Titan%202022&ved=2ahUKEwjNtrXi2IiEAxXA1ckDHQdFD2wQMygBegQIARBT
Nissan Kicks 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Fkicks%2F2022%2Foem%2F2022_nissan_kicks_4dr-hatchback_sr_fq_oem_1_1600.jpg&tbnid=JseTUjrIFwSZWM&vet=12ahUKEwjf7Nzp2IiEAxV1G9AFHd5CBosQMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Fkicks%2F2022%2F&docid=03YB_viAxe_u5M&w=1600&h=1067&q=Nissan%20Kicks%202022&ved=2ahUKEwjf7Nzp2IiEAxV1G9AFHd5CBosQMygAegQIARBT
Nissan Pathfinder 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Fpathfinder%2F2022%2Ffe%2F2022_nissan_pathfinder_f34_fe_527212_1600.jpg&tbnid=uUAp7CJRueEKHM&vet=12ahUKEwjiw8Pz2IiEAxWN0ckDHZRxDHcQMygFegQIARBh..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fcar-news%2Fthe-2022-nissan-pathfinder-is-new-and-improved-but-possibly-not-improved-enough.html&docid=N7rCe6vSsb7urM&w=1600&h=1067&q=Nissan%20Pathfinder%202022&ved=2ahUKEwjiw8Pz2IiEAxWN0ckDHZRxDHcQMygFegQIARBh
Nissan Armada 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Farmada%2F2022%2Foem%2F2022_nissan_armada_4dr-suv_platinum_fq_oem_1_1600.jpg&tbnid=CwjQ0WrIXSLtMM&vet=12ahUKEwjvoOr-2IiEAxUVxskDHVdYDQwQMygKegQIARBt..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Farmada%2F2022%2F&docid=MpTOoK2-e20r5M&w=1600&h=1067&q=Nissan%20Armada%202022&ved=2ahUKEwjvoOr-2IiEAxUVxskDHVdYDQwQMygKegQIARBt
Nissan 370Z 2022 // 1200x720 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Fthumb%2F7%2F75%2FNissan_FAIRLADY_Z_%2528Z34%2529_Version_ST%252C_2022%252C_left-front.jpg%2F1200px-Nissan_FAIRLADY_Z_%2528Z34%2529_Version_ST%252C_2022%252C_left-front.jpg&tbnid=ckwQEZKhm55qYM&vet=12ahUKEwjPsMWL2YiEAxVH5skDHWTaD0YQMygRegQIARB7..i&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FNissan_Z_(RZ34)&docid=ROJRkBzwhKuMKM&w=1200&h=720&q=Nissan%20370Z%202022&ved=2ahUKEwjPsMWL2YiEAxVH5skDHWTaD0YQMygRegQIARB7
Nissan GT-R 2022 // 1920x1080 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.motor1.com%2Fimages%2Fmgl%2FrMjOr%2Fs1%2F2022-nissan-gt-r-nismo-special-edition.jpg&tbnid=RQDrIVkUIwXVMM&vet=12ahUKEwiXr_qk2YiEAxWQN94AHR_tAA4QMygLegQIARBh..i&imgrefurl=https%3A%2F%2Fwww.motor1.com%2Fnews%2F532679%2F2022-nissan-gtr-livestream%2F&docid=Ocr50xWP4CU0sM&w=1920&h=1080&q=Nissan%20GT-R%202022&ved=2ahUKEwiXr_qk2YiEAxWQN94AHR_tAA4QMygLegQIARBh
Nissan Frontier 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Ffrontier%2F2022%2Foem%2F2022_nissan_frontier_extended-cab-pickup_sv_fq_oem_1_1600.jpg&tbnid=GMDKELVOVD4yoM&vet=12ahUKEwjXnMDB2YiEAxUvyMkDHW12BJgQMygFegQIARBe..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Ffrontier%2F2022%2Fking-cab%2F&docid=bXbDue9GWKgYIM&w=1600&h=1067&q=Nissan%20Frontier%202022&ved=2ahUKEwjXnMDB2YiEAxUvyMkDHW12BJgQMygFegQIARBe
Nissan Versa 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fnissan%2Fversa%2F2020%2Foem%2F2020_nissan_versa_sedan_sr_fq_oem_1_1280.jpg&tbnid=G4TWemRiXqH2PM&vet=12ahUKEwie6K3J2YiEAxUNyckDHYspBXoQMygPegQIARBy..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fnissan%2Fversa%2F2022%2F&docid=v32cUcAzMpvQhM&w=1280&h=855&q=Nissan%20Versa%202022&ved=2ahUKEwie6K3J2YiEAxUNyckDHYspBXoQMygPegQIARBy
Nissan LEAF 2022 // 1536x864 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fev-database.org%2Fimg%2Fauto%2FNissan_Leaf_2022%2FNissan_Leaf_2022-01%402x.jpg&tbnid=UOI_s6IT3bYR9M&vet=12ahUKEwiW8r7e2YiEAxXqzMkDHe-RAZ0QMygMegQIARBq..i&imgrefurl=https%3A%2F%2Fev-database.org%2Fcar%2F1656%2FNissan-Leaf&docid=P88qz8CLEH7E9M&w=1536&h=864&q=Nissan%20LEAF%202022&ved=2ahUKEwiW8r7e2YiEAxXqzMkDHe-RAZ0QMygMegQIARBq
Nissan NV200 Compact Cargo 2022 // 1200x628 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn-fastly.thetruthaboutcars.com%2Fmedia%2F2022%2F06%2F30%2F8669752%2Fcapsule-review-2014-nissan-nv200-sv-cargo-van.jpg%3Fsize%3D1200x628&tbnid=h-MbQwabJzK8CM&vet=12ahUKEwiJkbf62YiEAxXqxskDHWItBXgQMyhHegUIARD5AQ..i&imgrefurl=https%3A%2F%2Fwww.thetruthaboutcars.com%2F2014%2F08%2Fcapsule-review-2014-nissan-nv200-sv-cargo-van%2F&docid=T8s99TA_97e0tM&w=1200&h=628&q=Nissan%20NV200%20Compact%20Cargo%202022&ved=2ahUKEwiJkbf62YiEAxXqxskDHWItBXgQMyhHegUIARD5AQ

 */
