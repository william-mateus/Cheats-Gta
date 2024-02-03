package br.com.willaimsilva.cheatsgta

import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import br.com.willaimsilva.cheatsgta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_gta_v,R.id.nav_gtaiv,R.id.nav_gta2,R.id.nav_gta1
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener(NavController.OnDestinationChangedListener { controller, destination, arguments ->
          when(destination.id){

              R.id.nav_gallery->{
                 binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.toobar_vc))
              }
              R.id.nav_home->{
                  binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.purple_500))
              }
              R.id.nav_slideshow->{
                  binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.toobar_iii))
              }
              R.id.nav_gta_v->{
                  binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.toobar_gtav))
              }
              R.id.nav_gtaiv->{
                  binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.toobar_iv))
              }
              R.id.nav_gta2->{
                  binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.toobar_gta2))
              }
              R.id.nav_gta1->{
                  binding.appBarMain.toolbar.setBackgroundColor(getColor(R.color.toobar_gta1))
              }

          }

        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}