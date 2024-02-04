package com.cars.info.data.models

data class Car(
    val id: String, // n1
    val make: String, // Nissan
    val model: String, // Frontier
    val year: Int, // 2022
    val price: Int?, // $50,200
    val bodyType: BodyType, // Truck
    val fuelType: FuelType, // Gasoline
    val transmissionType: TransmissionType, // Automatic
    val engineDisplacement: EngineDisplacement, // 3.8L
    val fuelEfficiency: FuelEfficiencyMPG?, // 18 city / 24 highway   MPG
    val topSpeed: Int, // 115 mph
    val acceleration: Float?, // 8.5 seconds  (0-60 mph)
    val horsepower: Int, // 310 hp
    val torque: Int?, // 281 lb-ft
    val wheelbase: Float, // 126 in
    val curbWeight: Int, // 4,502 lbs
    val dimensions: Dimensions, // 219" x 73" x 72"    // LxWxH
    val cargoCapacity: Float?, // 14.3 cubic feet
    val seatingCapacity: String, // 4-5 seats
    val feature: List<String>,
    val imageUrl: String
)
// N/A
