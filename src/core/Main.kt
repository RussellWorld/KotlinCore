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
            """SELECT Language, Percentage FROM countryLanguage WHERE CountryCode = 'RUS' ORDER BY Percentage DESC""", null)
    )

    //Get first row
    cursor.moveToFirst()
    println("${cursor.getString(0)} : ${cursor.getDouble(1)}")

    //Get All rows
    while (!cursor.isAfterLast()) {
        println("${cursor.getString(0)} : ${cursor.getDouble(1)}")
        cursor.moveToNext()
    }

    //Close the connection
    cursor.close()
}

class DataBaseHelper(context: Context, dbName: String) :
        SQLiteOpenHelper(context, dbName, null, 1) {
    override fun onCreate(db: SQLiteDataBase?) {}
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}

}