# VK mobile internship task

[internship.vk.company/vacancy/801](https://internship.vk.company/vacancy/801)

**Stack:** [Kotlin](https://kotlinlang.org/), [Jetpack Compose](https://developer.android.com/jetpack/compose), [Kotlin coroutines](https://developer.android.com/kotlin/coroutines), [Retrofit](https://square.github.io/retrofit/), [Coil](https://coil-kt.github.io/coil/)

<div style="text-align: center;"><img src="screenshot.png" width="403" height="851" alt="app screen"></div>
https://www.youtube.com/watch?v=taqClwEIhps

### На русском:

**Задача:** *написать приложение, отображающее вывод товаров, используя данные из [dummyjson.com/products](https://dummyjson.com/products)*

Приложение должно подгружать данные из интернета, кэширование не требуется. Обязательно реализовать отображение полей `title`, `description` и `thumbnail`. Дизайн можно выбрать на своё усмотрение, но реализация должна соответствовать `Material Guidelines`. Данные необходимо загружать страницами по 20 штук (управляется query параметрами `skip` и `limit`. Например, `/products?skip=40&limit=20` выведет 20 продуктов, начиная с 41-го). Использование сторонних библиотек не воспрещается, но оно должно быть обоснованным.

**Рекомендации:**
Для написания использовать `Kotlin` (предпочтительнее) или `Java`, для вёрстки можно использовать `Android Views (xml)` или `Jetpack Compose`, для асинхронного выполнения можно использовать `RxJava` (на проекте более распространена именно она) или `Coroutines`, для загрузки картинок – `Glide`, `Fresco` или любую другую библиотеку на своё усмотрение.

**Дополнительно:**
Можно поддержать функционал, например:
1. Отображение дополнительных полей (например, цен или остальных изображений товара).
2. Переход на экран товара.
3. Поиск (как локальный, так и через бэкенд, с помощью запроса `/products/serach?q=<запрос>`).
4. Сортировка по категориям (информацию о категориях можно получить через запрос `/products/categories`, список товаров в категории через `/products/category/<категория>`).

Обращаем внимание, что это **дополнительный** функционал. В первую очередь будет оцениваться проработка обязательной части. Например, приложение с дополнительным функционалом, но вылетающее при получении сетевой ошибки на запрос `/products` будет оценено ниже, чем приложение без дополнительного функционала, но с корректной обработкой ошибок.

### In English:

**Task:** *write an application that displays product output using data from [dummyjson.com/products](https://dummyjson.com/products)*

The application must load data from the Internet; caching is not required. It is necessary to implement the display of the `title`, `description` and `thumbnail` fields. The design can be chosen at your discretion, but the implementation must comply with the `Material Guidelines`. Data must be loaded in pages of 20 pieces (controlled by the query parameters `skip` and `limit`. For example, `/products?skip=40&limit=20` will display 20 products, starting from the 41st). The use of third-party libraries is not prohibited, but it must be justified.

**Recommendations:**
For writing, use `Kotlin` (preferable) or `Java`, for layout you can use `Android Views (xml)` or `Jetpack Compose`, for asynchronous execution you can use `RxJava` (it is more common in the project) or `Coroutines`, for loading images - `Glide`, `Fresco` or any other library at your own discretion.

**Additionally:**
You can support functionality, for example:
1. Display additional fields (for example, prices or other product images).
2. Go to the product screen.
3. Search (both local and through the backend, using the request `/products/serach?q=<query>`).
4. Sorting by category (information about categories can be obtained through the request `/products/categories`, a list of products in the category through `/products/category/<category>`).

Please note that this is ***additional*** functionality. First of all, the development of the mandatory part will be assessed. For example, an application with additional functionality but crashes when receiving a network error for the `/products` request will be rated lower than an application without additional functionality but with correct error handling.