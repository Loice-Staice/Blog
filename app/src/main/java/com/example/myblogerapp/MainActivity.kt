package com.example.myblogerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myblogerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvInfomation.layoutManager = LinearLayoutManager(this)
        displayArticle()
    }

     fun displayArticle() {
        val article1 = Article("Michael", "https://example.com/post1", "Racketeer", "2022-01-01", "I am a girl who lives in the village", " ", " ")
        val article2 = Article("Pearl", "https://example.com/post2", "Sweet Tooth", "2022-01-01", "Live up to the sky"," "," ")
        val article3 = Article("Salma", "https://example.com/post3", "Shaking Grave", "2022-01-01","That is the day i knew i was fearless","","")
        val article4 = Article("Milan", "https://example.com/post4", "All in One", "2022-01-01","The cool car is from Germany","","")
        val article5 = Article("Aggy", "https://example.com/post5", "All is Coming Back", "2022-01-01","This is my work ","","")

        val articleList = listOf(article1, article2, article3, article4, article5)
        val articleAdapter = ArticleAdapter(articleList)
        binding.rvInfomation.adapter = articleAdapter
    }
}


