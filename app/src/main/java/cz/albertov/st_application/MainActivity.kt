 package cz.albertov.st_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

    lateinit var button_pridat : Button
    lateinit var text_rozpis : TextView
    var stisk = 0

//https://developer.android.com/guide/topics/ui/layout/recyclerview

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_rozpis = findViewById(R.id.button_pridat)

        button_pridat = findViewById(R.id.button_pridat)
        button_pridat.setOnClickListener {
            //zde prepnout na stranku pro pridani akce
            stisk += 1
            text_rozpis.text = "stisknuto"//stisk.toString()
        }
    }

     /*class CustomAdapter(private val dataSet: Array<String>) :
             RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

         /**
          * Provide a reference to the type of views that you are using
          * (custom ViewHolder).
          */
         class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
             val textView: TextView

             init {
                 // Define click listener for the ViewHolder's View.
                 textView = view.findViewById(R.id.textView)
             }
         }

         // Create new views (invoked by the layout manager)
         override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
             // Create a new view, which defines the UI of the list item
             val view = LayoutInflater.from(viewGroup.context)
                     .inflate(R.layout.text_row_item, viewGroup, false)

             return ViewHolder(view)
         }

         // Replace the contents of a view (invoked by the layout manager)
         override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

             // Get element from your dataset at this position and replace the
             // contents of the view with that element
             viewHolder.textView.text = dataSet[position]
         }

         // Return the size of your dataset (invoked by the layout manager)
         override fun getItemCount() = dataSet.size

     }*/

 }

