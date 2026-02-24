package com.mihrinurilunt.superherobookproject


import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.recycler_row.view.*

//bağlayıcı sınıfı yazıcaz. ona da adaptör deniyor. adaptör genel bir isimdir genelde bu tarz kaynakları bağlarken kullandığımız bir yapı

//receyclerAdapter yazareken bir sınıf oluşturmamız gerekiyor ki zaten oluşturduk
//ondan sonra da bu sınıfın bir recycleAdapter'ı olacağını belirtmemiz gerekiyor


class RecyclerAdapter(private val heroList : ArrayList<String>, val heroPics : ArrayList<Int>):RecyclerView.Adapter<RecyclerAdapter.SuperheroVH>() {  //RecyclerView adapter named RecyclerAdapter

        private val View.recyclerViewTextView: TextView
        get() = findViewById(R.id.recyclerViewTextView)    /**!!!!**/

    class SuperheroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //This is the ViewHolder class that represents each item view in the RecyclerView.
       // It holds a reference to the item view, which will be used to access and modify its contents.
    }

    //ViewHolder sınıfı oluşturulduğu zaman yapılacak işlemler
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroVH { //SuperheroVH classını döndürecek

        //Inflater , LayoutInflater , MenuInflater
        //bir xml'i buraya bağlarken inflater kullanmamız gerekiyor

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        //kısaca burdaki itemView bizim oluşturduğumuz recycler_row ile görünümümüzü birbirine bağlamasına yardım olacak
        //!! her bir oluşturulan recycler row'a itemView diyoruz

        return SuperheroVH(itemView)
    }

    //bu recyclerView içerisinde kaç şey yani kaç tane sıra olacak
    override fun getItemCount(): Int {    //int döndürecek
        //main activitydeki listeyi istemem lazım ki o liste içinde kaç tane eleman varsa o kadar sıra oluşturayım
        //bunun için RecyclerAdapter classın constructer'ı içinde bir liste tanımıyorum ve maindeki listeyi adapter ile bu file'daki sınıfa gönderiyorum

        return heroList.size  //
    }

    //SuperheroVH'a direkt değişkenle ulaşabiliyoruz (holder)
    override fun onBindViewHolder(holder: SuperheroVH, position: Int) {

        holder.itemView.recyclerViewTextView.text = heroList[position]

            holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,PresentationActivity::class.java) //her bir rowa tıklanınca PresentationActivity'e gidicek
            intent.putExtra("heroName", heroList[position])
            //intent.putExtra("heroPic", heroPics[position]) --> int yapmadan önce uygulama çöküyor çünkü intentle böyle büyük verileri yollayamıyoruz!! singleton kullanabiliriz
                intent.putExtra("heroPic", heroPics[position])


            //öyle bi sınıf yazıcaz ki sadece tek nesne olacak. tek nesne olması bize şöyle bir fayda sağlayacak:
            //o nesneyi ben her çağırdığımda uygulamamın herhangi bir yerinde istediğim her yerde ulaşabilicem.
                /*
                val singleton = SingletonClass.ChosenHero
                singleton.photo = heroPics[position]
                */

            holder.itemView.context.startActivity(intent) //!!
        }

    }


}