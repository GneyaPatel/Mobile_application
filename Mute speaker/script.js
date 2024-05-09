function translate() {
	// Get the source language, target language, and text to translate
	const sourceLanguage = document.getElementById("source-language").value;
	const targetLanguage = document.getElementById("target-language").value;
	const textToTranslate = document.getElementById("text-to-translate").value;

	// Construct the API URL
	const apiUrl = `https://translation.googleapis.com/language/translate/v2?key=YOUR_API_KEY&q=${encodeURIComponent(textToTranslate)}&source=${sourceLanguage}&target=${targetLanguage}`;

	// Call the API using the Fetch API
	fetch(apiUrl)
		.then(response => response.json())
		.then(data => {
			// Get the translated text and display it on the page
			const translatedText = data.data.translations[0].translatedText;
			document.getElementById("translated-text").innerText = translatedText;
		})
		.catch(error => console.log(error));
}
