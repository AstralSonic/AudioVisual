<<< OVERVIEW >>>
< NAME: Guilherme Pereira
< COURSE: COP 3003 - Object Oriented Programming
< PROJECT: Audio Visual Project
< DESCRIPTION: The purpose of this project is to create a store-like infrastructure in
< which the client can access the program's interface and use the interface to
< select an item for purchase. Such items are categorized under
< different types, such as MP3 and WAV or LED and LCD screens. 
<<< ======================================================================================= >>>

<<< CLASS DESCRIPTIONS >>>

< NAME: AudioPlayer
< DESC: This class keeps creates the audioSpecification and mediaType fields that are later
< used in MultimediaControl. this class inherits fields from Products and implements
< MultimediaControl.



< NAME: AudioPlayerDriver
< DESC: The purpose of this class is to run sample inputs for the AudioPlayer class. 



< NAME: EmployeeInfo
< DESC: Employee information is stored here. This class will ask the user to input their
< first and last name and department ID. The code checks to see if the name is put in properly.
< If the name is input incorrectly, then the name will be displayed as "Guest", is the department
< is input incorrectly, then the deptID will be put in as "None01". The deptID is in reverse for
< security measures.



< NAME: Item
< DESC: A program that takes in the information of a product, saves that information, and displays
< it when the user asks for that product.



< NAME: ItemType
< DESC: This is where the items/products are stored when the customer or client asks for them. An acronyme
< will also be shown next to the product.



< NAME: Main
< DESC: This program is similar to a shopping list program in which the user will be able
< view products that have been put into the system. Employees will be able to create their own
< profile with their name and user ID for the system to keep track of and can add new items into
< the line of their sale products.
< Main will run the program and show the products listed underneath ItemType.



< NAME: MonitorType
< DESC: This class (or Enum) lists out the two different monitor types: LCD and LED.



< NAME: MoviePlayer
< DESC: his class extends from Product (inherits the fields from Product) and implements
< MultimediaControl (because it is an interface, therefore it cannot be inherited). The purpose of
< this class is to give commands for movie player devices to let the user know when the audio is
< playing, stopping, going next or returning to a previous audio.



< NAME: MoviePlayerDriver
< DESC: This driver class tests (or runs) the contents from MoviePlayer by giving it some
< sample input for each field, such as name, resolution, refreshrate, response time, and monitor
< type.



< NAME: MultimediaControl
< DESC: Commands for classes such as MoviePlayer



< NAME: PlayerDriver
< DESC: This is a driver class that tests out the media player class by passing in sample
< arguments into the parameters.



< NAME: ProcessFiles
< DESC: Stores the results of the tests and who carried out that test to a file for
< archiving purposes



< NAME: Product
< DESC: Product saves the information of the products put into the system.



< NAME: Screen
< DESC: This class outputs the screen properties of a product such as its resolution, refresh
< rate, and response time.



< NAME: ScreenDriver
< DESC: Places sample input for the resolution, refreshrate, and response time.



< NAME: ScreenSpec
< DESC: An interfac thhat defines the resolution, refreshrate, and responsetime methods.



< NAME: testCollections
< DESC: Stores all the default information into the program. Once the program runs, 
< the designated objects will have predifined elements inside of them for the user to see
< and choose from. AudioPlayer and MoviePlayer objects are used in here.



< NAME: TestProductionLine
< DESC: A driver class that tests the EmployeeInfo class.


< NAME: ViewFileInfo 
< DESC: The purpose of this driver class  will read the information from the
< TestResults.txt file and display the contents to the console. If the file does not exist, a try
< catch statement will catch the error and let the user know that the file is not there.



<<< ====================================================================================== >>>
