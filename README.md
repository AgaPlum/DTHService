# DTHService
Create for Java training

### Structure

Class:
* DTHService
* Package
* Chanel
* SpecialPackage
* NormalPackage
* Category

### Description

<b>+addPackage(Package p):boolean</b>

This method will add the particular package to the DTHService  only if the package   is not present in the DTHService and return true. Otherwise return  false


<b>+findChannel(int channelId) throws ChannelNotFoundException:Channel</b>

This method will check  if the particular channel is present  in the  existing list of packages in the DTHServices and   hence need to  return channel details  .Otherwise need to throw an exception- ChannelNotFoundException in the below format “The given channel is not found”


<b>+tagChannelToPackage(Package p,Channel c):String</b>

This method will add the given  channel to the given  package  only if the  totalChannels tagged to that package is less than 5.And hence return “The channel ---- is  tagged to the package....”/.
Otherwise display the message like “The channel cannot be tagged

<b>+findChannelRating(float rating):ArrayList<Channel></b>

This method will return all the channels whose rating is greater than the given rating

<b>Demo</b>

need to invoke all the methods from the main method class
  
