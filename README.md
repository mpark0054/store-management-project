# store-management-project
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

![alt text](<Copy of UML Diagram - Megan Park.png>)

## Description

This project is the opening of my new business, which sells different types of plants, specifically general plants like flower and cacti. This store is programmed to showcase a variety of plants to choose from, such as providing the prices, the origin of the dirt/pot, and the specific traits that the plants hold. The reason I chose this topic is because I've always felt that the presense of just a singular plant can bring the simplest amount of joy to the atmosphere around it. This store uses a class hierarchy which models plants that hold unique properties such as a base class and object interaction. With the use of polymorphism the Flower and Cactus classes extend the Plant class, which add specific properties like color and size. Future user inputs might look like this:

- "What type of plant would you like to buy? (Plant/Flower/Cactus)"
- "Enter the price for your plant:"

In which the program would accept these user responses with strings for types and attributes, yes/no, doubles for prices.

example) 

Plant:

Price: $20.0

Pot Included: Yes

Dirt Included: Yes

This program used inheritance, polymorphism, and encapsulation which allow for the code to be both reusable and flexible, along with relating to a real-world store.
