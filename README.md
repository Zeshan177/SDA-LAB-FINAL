Based on the architecture, the code implements the following steps:

Guest Interaction:

A guest user visits the platform.
They can browse available products using the viewProduct() method in the Guest class.
If they want to make a purchase, they must register as a customer (getRegister() → cust_register()).
Customer Interaction:

A registered customer logs in and views available products (viewProduct() in Product class).
They add items to the cart using the addToCart() method in the Product class.
If they decide to remove an item, they use removeProduct() from the Cart class.
Checkout and Payment:

Once the cart is ready, the total is calculated (total attribute in Cart class).
The customer proceeds to payment via the Payment class. Payment details and type are stored here.
The Bank System facilitates payment by logging in and debiting the required amount.
Order Completion:

After successful payment, the customer gets confirmation, and the transaction is stored for future reference (view() method in Payment class).
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

How It Matches the Architecture
Your code aligns with the shopping assistant architecture in these ways:

The Customer Class handles registration and profile management.
The Guest Class ensures non-registered users can browse but not purchase.
The Product and Cart Classes manage products and shopping cart operations.
The Payment and Bank System Classes handle the financial transaction side.
The interaction flow is clear, starting from product selection to checkout and payment.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


HOW I OPENED THE CODE


DRAG THE LIBRARIES FROM THE LOCATION OF NET BEANS LIBRARY 
DRAG ALL THE SRC CLASSES
ADDED OUTPUT 
ADDED DIAGRAM
