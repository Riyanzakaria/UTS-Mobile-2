package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RiwayatDao {
    @Insert
    suspend fun tambahRiwayat(riwayat: Riwayat)

    @Query("SELECT * FROM tabel_riwayat ORDER BY id DESC")
    fun ambilSemuaRiwayat(): Flow<List<Riwayat>>
}