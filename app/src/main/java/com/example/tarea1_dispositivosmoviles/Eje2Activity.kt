package com.example.tarea1_dispositivosmoviles

import android.hardware.camera2.CameraExtensionSession.StillCaptureLatency

fun main() {
    val tittle = "Tu falta de querer"
    val artist = "Mon Laferte"
    val yearPublished = "2015"
    val reproductions = 1000

    song(tittle, artist, yearPublished, reproductions)
}

fun song(
    tittle: String,
    artist: String,
    yearPusblished: String,
    reproductions: Int
) {
    val popularity = if (reproductions < 1000){ "Poco popular" }else{ "Muy popular" }
    println("$tittle, interpretada por $artist, se lanzó en $yearPusblished ----- $popularity")
}