# app1
Created a basic app which contains few buttons and a photo using kotlin language in Android Studio.
When you click on the button it changes background color into another color and displays a small toast message on the screen 

Learnt : how to use buttons,Images.
         detailed understanding of how to use toast completely.

code :


        buttonread.setOnClickListener {
            //change to light mode
            layout.setBackgroundResource(R.color.yellow)
        }

        buttondark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        buttonjayesh.setOnClickListener {
            layout.setBackgroundResource(R.color.teal_700)
            Toast.makeText(applicationContext, "JAYESH REDDY", Toast.LENGTH_SHORT).show()
        }
        buttonaryan.setOnClickListener {
            layout.setBackgroundResource(R.color.teal_200)
            Toast.makeText(applicationContext, "THIS APP IS DESIGNED BY ARYAN", Toast.LENGTH_SHORT).show()
        }
        buttonbenz.setOnClickListener {
            layout.setBackgroundResource(R.color.green)
        }
