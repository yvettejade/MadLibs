# MadLibs
1. First, have one person in each group, hereafter called the “owner”, Fork the MadLibs project from my GitHub repository.  This creates a totally separate version of the project that will be independent of mine.

2. Then, each other person in the group should fork that person’s project.  This also creates a copy, but it is downstream of the owner they copied it from.  You can make changes on your code but cannot write to the owners project history without permission.

3. Each group member makes one of the changes described in the Java file to that java file.  This will require both changing that Java file and also creating a new txt file, adding it to the repository.

4. When you make a change, ANY change, you must commit that change, writing a short comment about what the change is.  These “commits” keep a record of every change, and allow undoing of detrimental changes.

5. When you are satisfied with your changes, you are ready to add those changes back to the owners code (which everyone in the group is writing code for).  To avoid conflicts you must for see if anyone else added code to the repository.  To do this *you must first pull the latest changes* which other coders added.  If there is a conflict when pulling, see the footnotes. Otherwise, test to make sure your code works, and continue!

6. When you are fully satisfied with your changes, you should now push your changes back to the original, by creating a request for the owner to pull into their code (I know, you push code by requesting they pull, what?!?).  The owner must then approve the pull request ASAP and take care of the merge; if there are any merge conflicts, they should be shared and discussed to resolve.

7. After every merged pull request, both the coder and the owner should test to confirm it works!  If it does, great!  If it does not, it should be removed or 'reverted' out of the master branch by the owner and fixed by the coder (following step 7).

8. Now everyone else needs to be updated that there is new working code!  They should pull the changes from the main branch *at their convenience* so that they have an updated copy (see step 7)!

9. Finally, each person should edit some of the files they *didn’t* create to add stories, nouns, verbs, etc., commit those changes, and submit pull requests so that everyone is able to contribute to whichever files they’d like!



### Pulling conflict notes:  
So you pulled the latest code and it seems some coder's work interferes with yours.  Yikes!  That's ok, but now you must read both your code and the conflicting code and fix it so that the code works as intended.
To do this you have 3 options:
1. Use ONLY your code and overwrite the other coders work 
	- This will make your code work, but it will likely delete or butcher other peoples code, likely making everything dysfunctional .
2. Use ONLY their code and overwrite your code
    - This will make their code work, but it will likely delete or butcher your code.  Sometimes it's easiest to chose this option and then add your code back in.
3. Select parts of both yours and theirs.  
    - This is the most common option.
	
How do you know what parts are conflicted?  Github will automatically *edit your file* with marker codes *<<<<<<<<<<* *==========* and *>>>>>>>>>* for each conflict
```
<<<<<<<<<
// Code here will be code from one of the conflicts
String programmer = new String("Mr. Stout");
=========
// Code here will be code from the other conflicts
String programmer = new String("Mr. Theiss");
>>>>>>>>>
```
In order for code to be resolved you have to delete the conflict markers and keep only the final desired code.  In this case we want both programmer names, so we resolve the conflict updating the code to the following:
```
String programmer = new String("Mr. Stout + Mr. Theiss");
```
