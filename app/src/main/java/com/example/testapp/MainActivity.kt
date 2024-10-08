package com.example.testapp

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.testapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.constraintLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                ConstraintLayoutExample::class.java
            )
            startActivity(myIntent)
        }

        binding.coordinatorLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                CoordinatorLayoutExample::class.java
            )
            startActivity(myIntent)
        }

        binding.frameLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                FrameLayoutExample::class.java
            )
            startActivity(myIntent)
        }

        binding.gridLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                GridLayoutExample::class.java
            )
            startActivity(myIntent)
        }

        binding.linearLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                LinearLayoutExample::class.java
            )
            startActivity(myIntent)
        }


        binding.relativeLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                RelativeLayoutExample::class.java
            )
            startActivity(myIntent)
        }

        binding.scrollviewLayout.setOnClickListener { view ->
            val myIntent: Intent = Intent(
                this@MainActivity,
                ScrollViewExample::class.java
            )
            startActivity(myIntent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}