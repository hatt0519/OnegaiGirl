package xyz.moroku0519.ongegaigirl

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import xyz.moroku0519.ongegaigirl.databinding.ActivityMockBinding

/**
 * Created by kazuki.hattori on 2018/05/27.
 */
class MockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMockBinding>(this, R.layout.activity_mock).apply {
            message.text = getString(R.string.mock_message, intent.getStringExtra(EXTRA_MESSAGE))
        }
    }

    companion object {
        private const val EXTRA_MESSAGE: String = "message"

        fun startMockActivity(context: Context, message: String) {
            fun createIntent(context: Context, message: String): Intent {
                return Intent(context, MockActivity::class.java).apply { putExtra(EXTRA_MESSAGE, message) }
            }
            context.startActivity(createIntent(context, message))
        }
    }
}