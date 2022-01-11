package com.example.appquestion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.appquestion.navigation.DetailViewFragment
import com.example.appquestion.navigation.ListFragment
import com.example.appquestion.navigation.QuestionFragment
import com.example.appquestion.navigation.SettingFragment
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , NavigationBarView.OnItemSelectedListener{

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.page_question -> {
                var questionFragment = QuestionFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, questionFragment).commit()
                return true
            }

            R.id.page_list -> {
                var listFragment = ListFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, listFragment).commit()
                return true
            }

            R.id.page_setting -> {
                var settingFragment = SettingFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, settingFragment).commit()
                return true
            }
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navi.setOnItemSelectedListener(this)

    }




}//