This app fully made with tutorial guide from youtube.


#Few pointers

Firebase realtime db
Will use single activity architecture
Use navigation components, splash screen, login, signup
Fragmentation
will use view binding, pop up dailogue, firebase auth
Progress bar, toast
Recycler view, fetch input, edit, create, delete

What actually learnt
- Connecting to firebase
- Firebase auth and realtime db (automatically) - app
- Setting up navigation (toml + build.gradle) - app
- Setting up view binding - app

- Splash scree fragment setup (xml)
- Navigation folder setup
- Initating graph setup
- Linking the fragments to the main acitvity

- Setting up colours xml
- Setting up themes xml
- Setting up strings xml
- Setting up navigation xml - id, name, label, layout. Action, destination
- Setting up fade xml
- Setting up font family

- Splash fragment
    - Scale type, horizontal bias, 0dp, gravity
- SignUp fragment
    - Cardusecompatpadding
    - Card.materialcardview, textfield.textinputlayout, textinputedittext
    - Boxstrokewidth, passwordtoggle, inputtype
    - Guideline
- SignIn fragment xml
- Home fragment xml recylerview
- Main activity, fragment, navgraph xml
- Todo dialogue box xml
- Todo list item xml

.kt files

Main activity
    - Class Appcompatactivity, fun onCreate
Splashfragment - class fragment
	- fun oncreateview
		- inflate, container, svedinstance state, view
	- fun onviewcreated 
		- view, savedinstance state, init(navcontroller, auth)
		- handler for delay
Signup fragment - class fragment
	- fun oncreateview
		- inflate, container, svedinstance state, view
		- binding.root
	- fun onviewcreated 
		- view, savedinstance state, init(navcontroller, auth)
		- setOnClickListener, register user, toast
SignIn fragment -  class fragment
	- fun oncreateview
		- inflate, container, svedinstance state, view
		- binding.root
	- fun onviewcreated 
		- view, savedinstance state, init(navcontroller, auth)
		- setOnClickListener, login user(addoncompletelistener), toast
Tododialog fragment - class dialog fragment
	- fun oncreateview, onviewcreated, interface
	- companion object, setlistener
	- todoData, save/update
