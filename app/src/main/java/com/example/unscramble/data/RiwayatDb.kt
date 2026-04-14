package com.example.unscramble.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Riwayat::class], version = 1, exportSchema = false)
abstract class RiwayatDb : RoomDatabase() {
    abstract fun riwayatDao(): RiwayatDao

    companion object {
        @Volatile
        private var INSTANCE: RiwayatDb? = null

        fun getDb(context: Context): RiwayatDb {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RiwayatDb::class.java,
                    "database_riwayat"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}