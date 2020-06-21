package ir.zinutech.android.backpresshandle.ui.main

import android.widget.Toast
import androidx.fragment.app.Fragment
import ir.zinutech.android.backpresshandle.R
import ir.zinutech.android.backpresshandle.utils.BackPressHandler

class OldWayFragment : Fragment(R.layout.fragment_old_way_layout), BackPressHandler {
  override fun onBackPressed(): Boolean {
    val shouldInterceptBackPress = shouldInterceptBackPress()
    if (shouldInterceptBackPress) consumeBackPress()
    return shouldInterceptBackPress
  }

  private fun consumeBackPress() {
    Toast.makeText(requireContext(), "Back press intercepted in:${this@OldWayFragment}", Toast.LENGTH_SHORT).show()
  }
  private fun shouldInterceptBackPress() = true

}