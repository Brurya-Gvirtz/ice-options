# Monte Carlo Option Pricing (Java)

This project calculates the price of financial options using Monte Carlo simulation in Java.
It supports multiple option types (Call, Put, Straddle, Square) and two pricing models: **LogNormal** and **Normal**.

## Features

* Object-oriented design
* Supports custom input: strike, volatility, time to maturity, simulations, etc.
* Accurate payoff computation using standard Monte Carlo

## How to Run

1. Compile the project:

   ```bash
   javac Main.java
   ```
2. Run the simulation:

   ```bash
   java Main
   ```

## Folder Structure

* `option/` – Option types
* `model/` – Pricing models
* `pricer/` – Monte Carlo calculator

