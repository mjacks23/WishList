package com.example.wishlist

class EmailAdapter {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val senderTextView: TextView
        val titleTextView: TextView
        val summaryTextView: TextView


        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            senderTextView = itemView.findViewById(R.id.senderTv)
            titleTextView = itemView.findViewById(R.id.titleTv)
            summaryTextView = itemView.findViewById(R.id.summaryTv)
        }
    }

    class EmailAdapter(private val emails: List<Email>) :
        RecyclerView.Adapter<EmailAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)

            val contactView = inflater.inflate(R.layout.email_item, parent, false)

            return ViewHolder(contactView)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // Get the data model based on position
            val email = emails.get(position)
            // Set item views based on views and data model
            holder.senderTextView.text = email.sender
            holder.titleTextView.text = email.title
            holder.summaryTextView.text = email.summary
        }

        override fun getItemCount(): Int {
            return emails.size
        }
    }
}