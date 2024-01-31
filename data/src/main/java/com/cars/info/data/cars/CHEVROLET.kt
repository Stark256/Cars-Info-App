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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fsilverado-1500%2F2022%2Foem%2F2022_chevrolet_silverado-1500_crew-cab-pickup_high-country_fq_oem_1_1600.jpg&tbnid=uXcQeE8bqMxP2M&vet=12ahUKEwj2xpba1YiEAxUbxckDHS48BI0QMygBegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fsilverado-1500%2F2022%2F&docid=7nD07-5hycI8PM&w=1600&h=1067&q=Chevrolet%20Silverado%201500%202022&ved=2ahUKEwj2xpba1YiEAxUbxckDHS48BI0QMygBegQIARBT"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fequinox%2F2022%2Foem%2F2022_chevrolet_equinox_4dr-suv_premier_fq_oem_1_1600.jpg&tbnid=T4o4-fZmwh9CCM&vet=12ahUKEwi0tdDj1YiEAxUq8ckDHU4bBwAQMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fequinox%2F2022%2F&docid=kh6x5xTPJh0QKM&w=1600&h=1067&q=Chevrolet%20Equinox%202022&ved=2ahUKEwi0tdDj1YiEAxUq8ckDHU4bBwAQMygAegQIARBT"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fmalibu%2F2021%2Foem%2F2021_chevrolet_malibu_sedan_premier_fq_oem_1_1280.jpg&tbnid=ziOsyEaQ4m_HFM&vet=12ahUKEwiJq6Xr1YiEAxV2yMkDHS3MDV0QMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fmalibu%2F2022%2F&docid=YG6q6QQn5lsp-M&w=1280&h=855&q=Chevrolet%20Malibu%202022&ved=2ahUKEwiJq6Xr1YiEAxV2yMkDHS3MDV0QMygAegQIARBT"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Ftraverse%2F2022%2Foem%2F2022_chevrolet_traverse_4dr-suv_high-country_fq_oem_1_1600.jpg&tbnid=rsSWqNEb4sYKsM&vet=12ahUKEwjC7a731YiEAxVT2MkDHSeUD5kQMygAegUIARCHAQ..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Ftraverse%2F2022%2F&docid=wQ_Q13pvidjjbM&w=1600&h=1067&q=Chevrolet%20Traverse%202022&ved=2ahUKEwjC7a731YiEAxVT2MkDHSeUD5kQMygAegUIARCHAQ"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fsilverado-2500hd%2F2020%2Foem%2F2020_chevrolet_silverado-2500hd_crew-cab-pickup_custom_f_oem_3_1600.jpg&tbnid=zSepxVDT2b7sjM&vet=12ahUKEwjbtp2A1oiEAxXRxckDHbntDkYQMygKegUIARCYAQ..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fsilverado-2500hd%2F2022%2F&docid=_8QUaFFhobEafM&w=1600&h=1067&q=Chevrolet%20Silverado%202500HD%202022&ved=2ahUKEwjbtp2A1oiEAxXRxckDHbntDkYQMygKegUIARCYAQ"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fblazer%2F2019%2Foem%2F2019_chevrolet_blazer_4dr-suv_premier_fq_oem_1_1280.jpg&tbnid=Lo4HeLAnJs--HM&vet=12ahUKEwiAgKeS1oiEAxVyNt4AHZIYB4oQMygEegQIARBc..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fblazer%2F2022%2F&docid=Qr7pN7pONj0m-M&w=1280&h=855&q=Chevrolet%20Blazer%202022&ved=2ahUKEwiAgKeS1oiEAxVyNt4AHZIYB4oQMygEegQIARBc"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fcolorado%2F2021%2Foem%2F2021_chevrolet_colorado_crew-cab-pickup_lt_fq_oem_1_1600.jpg&tbnid=GFF4NTLYZp01IM&vet=12ahUKEwjntrab1oiEAxXoxskDHQpPAHUQMygBegQIARBW..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fcolorado%2F2022%2F&docid=OOzGp60c-fKrpM&w=1600&h=1067&q=Chevrolet%20Colorado%202022&ved=2ahUKEwjntrab1oiEAxXoxskDHQpPAHUQMygBegQIARBW"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fcamaro%2F2022%2Foem%2F2022_chevrolet_camaro_coupe_2ss_fq_oem_1_1600.jpg&tbnid=mEuyLPsP1kMGKM&vet=12ahUKEwiUu8ai1oiEAxWIxckDHUR0BfwQMygBegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fcamaro%2F2022%2F&docid=OgifUruGqAK33M&w=1600&h=1067&q=Chevrolet%20Camaro%202022&ved=2ahUKEwiUu8ai1oiEAxWIxckDHUR0BfwQMygBegQIARBV"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Ftahoe%2F2022%2Foem%2F2022_chevrolet_tahoe_4dr-suv_high-country_fq_oem_1_1600.jpg&tbnid=SkeCmJanQ2ccHM&vet=12ahUKEwjHiY6r1oiEAxXy0MkDHS8XBwMQMygAegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Ftahoe%2F2022%2F&docid=tAM8Ki1-flDaBM&w=1600&h=1067&q=Chevrolet%20Tahoe%202022&ved=2ahUKEwjHiY6r1oiEAxXy0MkDHS8XBwMQMygAegQIARBV"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fhips.hearstapps.com%2Fhmg-prod%2Fimages%2F2018-chevrolet-sonic-005-1594307553.jpg&tbnid=ulMbP9gTelwCIM&vet=12ahUKEwj4upey1oiEAxUzx8kDHftiDJkQMygCegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.autoweek.com%2Fnews%2Findustry-news%2Fa33263070%2Fthe-chevy-sonic-is-dead%2F&docid=D8809rLcDx2H-M&w=1800&h=1012&q=Chevrolet%20Sonic%202022&ved=2ahUKEwj4upey1oiEAxUzx8kDHftiDJkQMygCegQIARBV"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.thedrive.com%2Fuploads%2F2022%2F04%2F20%2F2022-chevrolet-suburban-premier-review-6.jpg%3Fauto%3Dwebp%26crop%3D16%253A9%26auto%3Dwebp%26optimize%3Dhigh%26quality%3D70%26width%3D1440&tbnid=HEQG8_K8uhJTGM&vet=12ahUKEwif1MfS1oiEAxVX8MkDHbfFBTUQMygIegQIARBl..i&imgrefurl=https%3A%2F%2Fwww.thedrive.com%2Fnew-cars%2F2022-chevy-suburban-review-a-simple-beast-with-a-simple-mission&docid=Q86MWqtRNZlQXM&w=1440&h=810&q=Chevrolet%20Suburban%202022&ved=2ahUKEwif1MfS1oiEAxVX8MkDHbfFBTUQMygIegQIARBl"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Ftrax%2F2021%2Foem%2F2021_chevrolet_trax_4dr-suv_lt_fq_oem_1_1280.jpg&tbnid=6r73DPE0nANxhM&vet=12ahUKEwiuuPXt1oiEAxXpzskDHfRuAMwQMygBegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Ftrax%2F2022%2F&docid=xrKvpYnV_fEcMM&w=1280&h=855&q=Chevrolet%20Trax%202022&ved=2ahUKEwiuuPXt1oiEAxXpzskDHfRuAMwQMygBegQIARBV"
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
        ),
        image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.autotrader.com%2Fwp-content%2Fuploads%2F2021%2F02%2F2022-chevrolet-bolt-ev-driving-front-3qtr.jpg%3Fquality%3D75&tbnid=QYFoOMjLSEqoOM&vet=12ahUKEwjcqf_21oiEAxWN0ckDHZRxDHcQMygFegQIARBe..i&imgrefurl=https%3A%2F%2Fwww.autotrader.com%2Fcomparisons%2F2022-chevrolet-bolt-ev-choosing-the-right-trim&docid=sLd2w2n0Ho2wDM&w=1600&h=1200&q=Chevrolet%20Bolt%20EV%202022&ved=2ahUKEwjcqf_21oiEAxWN0ckDHZRxDHcQMygFegQIARBe"
    )

    val list = listOf(
        CHEVROLET_1, CHEVROLET_2, CHEVROLET_3, CHEVROLET_4, CHEVROLET_5, CHEVROLET_6, CHEVROLET_7, CHEVROLET_8, CHEVROLET_9, CHEVROLET_10, CHEVROLET_11, CHEVROLET_12, CHEVROLET_13
    )
}

/*

Chevrolet Silverado 1500 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fsilverado-1500%2F2022%2Foem%2F2022_chevrolet_silverado-1500_crew-cab-pickup_high-country_fq_oem_1_1600.jpg&tbnid=uXcQeE8bqMxP2M&vet=12ahUKEwj2xpba1YiEAxUbxckDHS48BI0QMygBegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fsilverado-1500%2F2022%2F&docid=7nD07-5hycI8PM&w=1600&h=1067&q=Chevrolet%20Silverado%201500%202022&ved=2ahUKEwj2xpba1YiEAxUbxckDHS48BI0QMygBegQIARBT
Chevrolet Equinox 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fequinox%2F2022%2Foem%2F2022_chevrolet_equinox_4dr-suv_premier_fq_oem_1_1600.jpg&tbnid=T4o4-fZmwh9CCM&vet=12ahUKEwi0tdDj1YiEAxUq8ckDHU4bBwAQMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fequinox%2F2022%2F&docid=kh6x5xTPJh0QKM&w=1600&h=1067&q=Chevrolet%20Equinox%202022&ved=2ahUKEwi0tdDj1YiEAxUq8ckDHU4bBwAQMygAegQIARBT
Chevrolet Malibu 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fmalibu%2F2021%2Foem%2F2021_chevrolet_malibu_sedan_premier_fq_oem_1_1280.jpg&tbnid=ziOsyEaQ4m_HFM&vet=12ahUKEwiJq6Xr1YiEAxV2yMkDHS3MDV0QMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fmalibu%2F2022%2F&docid=YG6q6QQn5lsp-M&w=1280&h=855&q=Chevrolet%20Malibu%202022&ved=2ahUKEwiJq6Xr1YiEAxV2yMkDHS3MDV0QMygAegQIARBT
Chevrolet Traverse 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Ftraverse%2F2022%2Foem%2F2022_chevrolet_traverse_4dr-suv_high-country_fq_oem_1_1600.jpg&tbnid=rsSWqNEb4sYKsM&vet=12ahUKEwjC7a731YiEAxVT2MkDHSeUD5kQMygAegUIARCHAQ..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Ftraverse%2F2022%2F&docid=wQ_Q13pvidjjbM&w=1600&h=1067&q=Chevrolet%20Traverse%202022&ved=2ahUKEwjC7a731YiEAxVT2MkDHSeUD5kQMygAegUIARCHAQ
Chevrolet Silverado 2500HD 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fsilverado-2500hd%2F2020%2Foem%2F2020_chevrolet_silverado-2500hd_crew-cab-pickup_custom_f_oem_3_1600.jpg&tbnid=zSepxVDT2b7sjM&vet=12ahUKEwjbtp2A1oiEAxXRxckDHbntDkYQMygKegUIARCYAQ..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fsilverado-2500hd%2F2022%2F&docid=_8QUaFFhobEafM&w=1600&h=1067&q=Chevrolet%20Silverado%202500HD%202022&ved=2ahUKEwjbtp2A1oiEAxXRxckDHbntDkYQMygKegUIARCYAQ
Chevrolet Blazer 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fblazer%2F2019%2Foem%2F2019_chevrolet_blazer_4dr-suv_premier_fq_oem_1_1280.jpg&tbnid=Lo4HeLAnJs--HM&vet=12ahUKEwiAgKeS1oiEAxVyNt4AHZIYB4oQMygEegQIARBc..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fblazer%2F2022%2F&docid=Qr7pN7pONj0m-M&w=1280&h=855&q=Chevrolet%20Blazer%202022&ved=2ahUKEwiAgKeS1oiEAxVyNt4AHZIYB4oQMygEegQIARBc
Chevrolet Colorado 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fcolorado%2F2021%2Foem%2F2021_chevrolet_colorado_crew-cab-pickup_lt_fq_oem_1_1600.jpg&tbnid=GFF4NTLYZp01IM&vet=12ahUKEwjntrab1oiEAxXoxskDHQpPAHUQMygBegQIARBW..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fcolorado%2F2022%2F&docid=OOzGp60c-fKrpM&w=1600&h=1067&q=Chevrolet%20Colorado%202022&ved=2ahUKEwjntrab1oiEAxXoxskDHQpPAHUQMygBegQIARBW
Chevrolet Camaro 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Fcamaro%2F2022%2Foem%2F2022_chevrolet_camaro_coupe_2ss_fq_oem_1_1600.jpg&tbnid=mEuyLPsP1kMGKM&vet=12ahUKEwiUu8ai1oiEAxWIxckDHUR0BfwQMygBegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Fcamaro%2F2022%2F&docid=OgifUruGqAK33M&w=1600&h=1067&q=Chevrolet%20Camaro%202022&ved=2ahUKEwiUu8ai1oiEAxWIxckDHUR0BfwQMygBegQIARBV
Chevrolet Tahoe 2022 // 1600x1067 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Ftahoe%2F2022%2Foem%2F2022_chevrolet_tahoe_4dr-suv_high-country_fq_oem_1_1600.jpg&tbnid=SkeCmJanQ2ccHM&vet=12ahUKEwjHiY6r1oiEAxXy0MkDHS8XBwMQMygAegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Ftahoe%2F2022%2F&docid=tAM8Ki1-flDaBM&w=1600&h=1067&q=Chevrolet%20Tahoe%202022&ved=2ahUKEwjHiY6r1oiEAxXy0MkDHS8XBwMQMygAegQIARBV
Chevrolet Sonic 2022 // 1800x1012 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fhips.hearstapps.com%2Fhmg-prod%2Fimages%2F2018-chevrolet-sonic-005-1594307553.jpg&tbnid=ulMbP9gTelwCIM&vet=12ahUKEwj4upey1oiEAxUzx8kDHftiDJkQMygCegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.autoweek.com%2Fnews%2Findustry-news%2Fa33263070%2Fthe-chevy-sonic-is-dead%2F&docid=D8809rLcDx2H-M&w=1800&h=1012&q=Chevrolet%20Sonic%202022&ved=2ahUKEwj4upey1oiEAxUzx8kDHftiDJkQMygCegQIARBV
Chevrolet Suburban 2022 // 1440x810 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.thedrive.com%2Fuploads%2F2022%2F04%2F20%2F2022-chevrolet-suburban-premier-review-6.jpg%3Fauto%3Dwebp%26crop%3D16%253A9%26auto%3Dwebp%26optimize%3Dhigh%26quality%3D70%26width%3D1440&tbnid=HEQG8_K8uhJTGM&vet=12ahUKEwif1MfS1oiEAxVX8MkDHbfFBTUQMygIegQIARBl..i&imgrefurl=https%3A%2F%2Fwww.thedrive.com%2Fnew-cars%2F2022-chevy-suburban-review-a-simple-beast-with-a-simple-mission&docid=Q86MWqtRNZlQXM&w=1440&h=810&q=Chevrolet%20Suburban%202022&ved=2ahUKEwif1MfS1oiEAxVX8MkDHbfFBTUQMygIegQIARBl
Chevrolet Trax 2022 // 1280x855 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fchevrolet%2Ftrax%2F2021%2Foem%2F2021_chevrolet_trax_4dr-suv_lt_fq_oem_1_1280.jpg&tbnid=6r73DPE0nANxhM&vet=12ahUKEwiuuPXt1oiEAxXpzskDHfRuAMwQMygBegQIARBV..i&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fchevrolet%2Ftrax%2F2022%2F&docid=xrKvpYnV_fEcMM&w=1280&h=855&q=Chevrolet%20Trax%202022&ved=2ahUKEwiuuPXt1oiEAxXpzskDHfRuAMwQMygBegQIARBV
Chevrolet Bolt EV 2022 // 1600x1200 // https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.autotrader.com%2Fwp-content%2Fuploads%2F2021%2F02%2F2022-chevrolet-bolt-ev-driving-front-3qtr.jpg%3Fquality%3D75&tbnid=QYFoOMjLSEqoOM&vet=12ahUKEwjcqf_21oiEAxWN0ckDHZRxDHcQMygFegQIARBe..i&imgrefurl=https%3A%2F%2Fwww.autotrader.com%2Fcomparisons%2F2022-chevrolet-bolt-ev-choosing-the-right-trim&docid=sLd2w2n0Ho2wDM&w=1600&h=1200&q=Chevrolet%20Bolt%20EV%202022&ved=2ahUKEwjcqf_21oiEAxWN0ckDHZRxDHcQMygFegQIARBe

 */
