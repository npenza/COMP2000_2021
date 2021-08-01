# Task 0

Clone this repository (well done!)

# Task 1

Take a look at the two repositories:

  * (A) https://bitbucket.org/altmattr/personalised-correlation/src/master/
  * (B) https://github.com/Whiley/WhileyCompiler

And answer the following questions about them:

  * These repositories are at two different websites - github and bitbucket - what are these sites?  What service do they provide? Which is better?
      Github and BitBucket two examples of hosted version control platforms we can use to push projects and code to, and revise past code. Github is better (Subjective)
  * Who made the last commit to repository A?
      Matthew Robberts
  * Who made the first commit to repository A?
      Jon Mountjoy
  * Who made the first and last commits to repository B?
      Dave Pearce
  * Are either/both of these projects active at the moment? 🤔 If not, what do you think happened?
      Both projects are somewhat active. Project A's last commit was July 9 of this year but just data, suggesting only the data is being updated and no improvemnets to the actual platform as a whole. while repo b has frequent commits, the most recent one being on Jul 25.
  * 🤔 Which file in each project has had the most activity?
      Repo 1 - 23 changes app.py
      Repo 2 - 696 changes build.num

      Note - when I run the git log func, there is a 7757 number with no file name attached - this may be the total?

# Task 2

The repository you just cloned is a VSCode project, so lets work with it.  It currently will print "Hello World" message to the console when run.

You will find "Run" and "Debug" commands over the `main` method.  Try them out.  You can also trigger them with `F5` for "Debug" and `Ctrl-F5` for "Run"

Modify the application so that instead it prints

~~~~~
Red vs. Blue
~~~~~

<<<<<<< HEAD
Done

=======
# Task 3

Draw a 20 by 20 grid on a 720x720 window.  Each cell in the grid should be 35 pixels high and wide and the grid should be drawn 10 pixels off the top and left borders of the screen.  To do this, you should use the `Graphics` class from the Java libraries.  Be sure to consult the tips video for this task (it is a link in iLearn).  Without it, you will be very confused.

# Task 4

The "grid" has no identity - it is just drawn.  Later on we will need to do lots of things "with" this grid.  We will modify it and adjust it and ask it questions.  Our task here is to refactor the program to give this grid an identity.  We will create an object to represent the grid and will give that object its own `paint` method for drawing the grid.

We will also need to give an identity to each "cell" of the grid and make each cell responsible for it's own painting to the screen.

Modify the program to make these things happen.  Make a `Grid` class and a `Cell` class and organise them in a sensible way.  What fields and methods should each class have?

# Task 5

Anything that is a `JFrame` or `JPanel` can find out the position of the mouse using `getMousePosition`.  Modify your program so that mousing over a cell will "highlight" it.  Highlighted cells should be drawn in grey.  You may have to think about how you will get the mouse position from the place you can read it, to the place it is needed (the `paint` method of a `Cell` object).
>>>>>>> upstream/main
