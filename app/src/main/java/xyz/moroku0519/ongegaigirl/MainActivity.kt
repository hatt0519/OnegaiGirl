package xyz.moroku0519.ongegaigirl

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import xyz.moroku0519.ongegaigirl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            setupBottomNavigation(bottomNavigation)
        }
        navigateToHome()
    }

    private fun setupBottomNavigation(bottomNavigationView: BottomNavigationView) {
        bottomNavigationView.setOnNavigationItemSelectedListener({ it ->
            when (it.itemId) {
                R.id.home    -> {
                    navigateToHome()
                }
                R.id.list -> {
                    navigateToList()
                }
                R.id.girl -> {
                    navigateToGirls()
                }
            }
            true
        })
    }

    private fun navigateToHome() {
        replaceFragment(MockFragment.newInstance("ホーム"))
    }

    private fun navigateToList() {
        replaceFragment(MockFragment.newInstance("一覧"))
    }

    private fun navigateToGirls() {
        replaceFragment(MockFragment.newInstance("女の子一覧"))
    }

    private fun replaceFragment(fragment: Fragment) {
        var transaction = supportFragmentManager.beginTransaction()
                .replace(R.id.content, fragment)

        if (supportFragmentManager.isStateSaved) {
            transaction.commitAllowingStateLoss()
        } else {
            transaction.commit()
        }
    }

}

