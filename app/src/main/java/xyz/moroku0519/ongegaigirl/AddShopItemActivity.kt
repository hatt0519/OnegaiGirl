package xyz.moroku0519.ongegaigirl

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import xyz.moroku0519.ongegaigirl.databinding.ActivityAddShopItemBinding

/**
 * Created by kazuki.hattori on 2018/06/03.
 */
class AddShopItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityAddShopItemBinding>(this, R.layout.activity_add_shop_item).apply {
            save.setOnClickListener({ finish() })
        }
    }

}