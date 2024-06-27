package com.example.myblogerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ArticleAdapter(private val articles: List<Article>) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.information_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article = articles[position]
        holder.tvAuthor.text = article.author
        holder.tvAuthorProfilePic.text= article.authorProfilePicture
        holder.tvTitle.text = article.title
        holder.tvPublishDate.text = article.publicationDate
        holder.tvPreview.text = article.previewText
        holder.tvLink.text = article.link



    }

    override fun getItemCount(): Int {
        return articles.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvLink=itemView.findViewById<TextView>(R.id.tvLink)
        val tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
        val tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
        val tvAuthorProfilePic = itemView.findViewById<TextView>(R.id.tvAuthorProfilePic)
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvPublishDate = itemView.findViewById<TextView>(R.id.tvPublicationDate)

    }
}
