package io.github.juanlucode.views

import javafx.scene.image.Image
import javafx.scene.image.ImageView

fun setImageView(imageView: ImageView, image: Image){
    imageView.image = image
    imageView.fitHeight = imageView.image.height
    imageView.fitWidth = imageView.image.width

}