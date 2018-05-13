package xyz.moroku0519.ongegaigirl

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by kazuki.hattori on 2018/05/13.
 */
class MockFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mock, container, false)
    }

    companion object {
        fun newInstance(): Fragment = MockFragment()
    }
}