package com.cars.info.common.models

data class CarListItemUI (
    val name: String,
    val imageUrl: String,
    val shortDescription: String,
    val price: String,
    val engineDesc: ImageTextUI,
    val transmissionDesc: ImageTextUI
) {
    class Builder {
        private var name: String = ""
        private var imageUrl: String = ""
        private var shortDescription: String = ""
        private var price: String = ""
        private var engineDesc: ImageTextUI = ImageTextUI.default()
        private var transmissionDesc: ImageTextUI = ImageTextUI.default()

        fun name(name: String) = apply { this.name = name }
        fun imageUrl(imageUrl: String) = apply { this.imageUrl = imageUrl }
        fun shortDescription(shortDescription: String) = apply { this.shortDescription = shortDescription }
        fun price(price: String) = apply { this.price = price }
        fun engineDesc(engineDesc: ImageTextUI) = apply { this.engineDesc = engineDesc }
        fun transmissionDesc(transmissionDesc: ImageTextUI) = apply { this.transmissionDesc = transmissionDesc }
        fun build() =
            CarListItemUI(
                name = this.name,
                imageUrl = this.imageUrl,
                shortDescription = this.shortDescription,
                price = this.price,
                engineDesc = this.engineDesc,
                transmissionDesc = this.transmissionDesc
            )
    }
}