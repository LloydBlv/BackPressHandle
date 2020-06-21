package ir.zinutech.android.backpresshandle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.zinutech.android.backpresshandle.ui.main.NewWayFragment
import ir.zinutech.android.backpresshandle.ui.main.OldWayFragment
import ir.zinutech.android.backpresshandle.utils.BackPressHandler
import ir.zinutech.android.backpresshandle.utils.getTopFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
//        .replace(R.id.container, NewWayFragment())
        .replace(R.id.container, OldWayFragment())
        .commitNow()
    }
  }

  /* Old way*/
  override fun onBackPressed() {
    if (!isTopFragmentConsumedBackPress()) {
      super.onBackPressed()
    }
  }

  private fun isTopFragmentConsumedBackPress() = getTopFragment<BackPressHandler>()?.onBackPressed() == true

}