# mc-advancement-tracker
A Java program that runs alongside Minecraft 1.16 to track the progress made towards advancements. It tracks not only what you have completed, but also the progress made towards larger advancements, like "Adventuring Time" and "A Complete Catalogue".

This program was written between November 2020 and January 2021, and at the time was the largest project I had worked on. The only part that I did not write was the RelativeLayout class. This beautiful piece of code is credited to Rob Camick, whose code can be found here:

(https://tips4java.wordpress.com/2008/11/02/relative-layout/)

Looking back at this code over a year later, I can see the flaws in the code... The file "Text.java" would have been much simpler if it was reading a json file, allowing for easier updates when newer versions of Minecraft come out. The amount of entries in the list could have been dynamically updated as more advancements were added. There are many things that could be fixed, but thats alright. I know these things now and I use these solutions in my projects now. This project was a huge learning experience, and I'm very happy with how it turned out.
