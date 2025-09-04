# Android ViewPager2 & RecyclerView Showcase

This repository demonstrates various aspects of Android development, focusing on implementing and customizing ViewPager2 and RecyclerView components. The project is organized into two independent modules to highlight best practices in Android architecture, UI design, and code organization.

## Project Overview

The main goal of this project is to explore different techniques for building swipeable interfaces and list-based navigation in Android. It includes sample implementations, customizations, and supporting code to help understand how ViewPager2 and RecyclerView can be used in real-world Android applications.

> [!NOTE]
> These samples are not intended as end-to-end solutions, but rather as explorations of different Android development concepts.

## Tech Stack

- **Language:** Kotlin
- **Build System:** Gradle (Kotlin DSL)
- **Android SDK:** Targeting modern Android versions
- **UI Components:** ViewPager2, RecyclerView, LinearLayoutManager, XML Layouts
- **Testing:** JUnit (Android Instrumentation & Unit Tests)
- **IDE:** Compatible with IntelliJ IDEA and Android Studio

## Project Structure

The repository is organized into two strictly independent modules:

### 1. `app` Module

- **Purpose:** Demonstrates a product listing interface using RecyclerView.
- **Contents:**
  - Implements its own `ProductListAdapter` for RecyclerView to display a list of products.
  - Uses `LinearLayoutManager` for vertical scrolling.
  - On item click, navigates to a details page showing more information about the selected product.
  - Contains all logic, resources, and adapters required for this functionality.

### 2. `viewPager` Module

- **Purpose:** Demonstrates ViewPager2 functionality in a simple gallery interface.
- **Contents:**
  - Implements its own `GalleryAdapter` for ViewPager2.
  - Allows users to swipe back and forth between images in a minimal interface.
  - Focuses solely on showcasing ViewPager2 usage and customization.

## How Components Relate

- The `app` and `viewPager` modules are completely independent and do not share code or dependencies.
- Each module defines its own adapters, resources, and navigation logic.
- This separation allows for focused exploration of different UI paradigms in Android.

## Key Features

- **Independent Modules:** Each module demonstrates a distinct UI concept with its own implementation.
- **RecyclerView Navigation:** The `app` module showcases list-based navigation and detail screens using RecyclerView.
- **ViewPager2 Gallery:** The `viewPager` module provides a swipeable image gallery using ViewPager2.
- **Resource Management:** Organized resources for easy customization and extension.
- **Testing Support:** Basic structure for unit and instrumentation tests.

## Getting Started

Open the project in IntelliJ IDEA or Android Studio. The modular structure allows you to explore, modify, and run the samples directly.
