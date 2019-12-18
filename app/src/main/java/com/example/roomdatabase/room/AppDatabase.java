package com.example.roomdatabase.room;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MahasiswaDao userDao();

    private AppDatabase db;

    db=Room.databaseBuilder(getApplicationContext(),
    AppDatabase.class,"mahasiswadb".build();
    db.userDao().insertmahasiswa(mahasiswa);


    private void onDeletemahasiswa(int position){
        db.userDao().deleteUsers(daftarMahasiswa(position));
        daftarBarang.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeRemoved(position, daftarMahasiswa.size());
    }
}
