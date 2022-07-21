package com.bignerdranch.android.beatbox

private const val WAV = ".wav"
class Sound(val assetPath: String, var soundId: Int? = null) {

    val name = assetPath.split("_").last().removeSuffix(WAV)
}