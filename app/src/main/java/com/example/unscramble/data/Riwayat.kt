package com.example.unscramble.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabel_riwayat")
data class Riwayat(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val kumpulan_kata: String,
    val skor_akhir: Int
)