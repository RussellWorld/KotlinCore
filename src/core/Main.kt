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
            """SELECT Language, Percentage FROM countryLanguage
                | WHERE CountryCode = ? AND Percentage > ?""".trimMargin(), arrayOf("RUS","0,5"))
    )


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