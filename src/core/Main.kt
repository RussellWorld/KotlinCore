package core


fun main() {
    //Connect to the database
    val dbHelper = DataBaseHelper(
            context,
            dbPath + "DatabaseName.sqlite"
    )

    //SQL query execution
    val db = dbHelper.readableDatabase
    val cursor = db.rawQuery(
            "SELECT * FROM country", null)
    )

    //Get the data
    cursor.moveToFirst()
    val countryName = cursor.getString(0)

    println(countryName)

    //Close the connection
    cursor.close()
}

class DataBaseHelper(context: Context, dbName: String) :
        SQLiteOpenHelper(context, dbName, null, 1) {
    override fun onCreate(db: SQLiteDataBase?) {}
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}

}