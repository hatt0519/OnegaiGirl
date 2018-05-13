package xyz.moroku0519.ongegaigirl

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xyz.moroku0519.ongegaigirl.databinding.FragmentMockBinding

/**
 * Created by kazuki.hattori on 2018/05/13.
 */
class MockFragment : Fragment() {

    private val fragmentName: String by lazy { arguments.getString(FRAGMENT_NAME) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentMockBinding = FragmentMockBinding.bind(inflater.inflate(R.layout.fragment_mock, container, false))
        binding.message.text = context.getString(R.string.mock_message, fragmentName)
        return binding.root
    }

    companion object {
        const val FRAGMENT_NAME = "fragment_name"

        fun newInstance(fragmentName: String): Fragment =
                MockFragment().apply {
                    arguments = Bundle().apply { putString(FRAGMENT_NAME, fragmentName) }
                }
    }
}