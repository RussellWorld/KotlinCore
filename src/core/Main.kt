package core


//on Android apk

class MainActivity : AppCompatActivity() {
    fun onClick() {
        CalcTask().execute
    }

    fun add(a: Int, b: Int): Int {
        Thread.sleep(3000)
        return a + b
    }

    private inner class CalcTask : AsyncTask<Unit, Unit, Int>() {
        override fun doInBackground(vararg params: Unit): Int {
            return add(3, 5)
        }

        override fun onPostExecute(result: Int?) {
            //synchronization with the main thread
            //for update user interface
            mResultTextView.setText(result!!.toString())
        }
    }
}