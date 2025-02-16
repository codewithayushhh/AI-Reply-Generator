# **AI Email Reply Generator** 🚀

This project is an **AI-powered email reply generator** that enhances Gmail by providing one-click AI-generated responses. It includes a **Spring Boot backend**, a **React Vite frontend**, and a **Chrome extension** for seamless email automation.

---

## **🔹 Features**
- **Chrome Extension**: Injects an **"AI Reply"** button into Gmail's compose window
- **AI-Powered Replies**: Generates professional, friendly, or casual email responses
- **Spring Boot Backend**: Handles AI processing and API requests
- **React Vite Frontend**: Provides a user-friendly interface
- **Google Gemini AI Integration**: Ensures high-quality and context-aware responses

---

## **🛠️ Tech Stack**
- **Backend**: Spring Boot, WebClient (for API requests)
- **Frontend**: React Vite, JavaScript, Tailwind CSS
- **Chrome Extension**: JavaScript (Content Script & Manifest v3)
- **AI Model**: Google Gemini API

---

## **🚀 How It Works**
1️⃣ **Chrome Extension** detects Gmail’s compose window and inserts an **AI Reply** button.  
2️⃣ **User clicks** the button to generate a response.  
3️⃣ **Email content is sent** to the Spring Boot backend.  
4️⃣ **Google Gemini AI processes** the request and returns a generated reply.  
5️⃣ **The AI-generated response** is inserted back into the Gmail compose box.

---

## **📌 Setup Instructions**
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/ai-email-reply-generator.git
cd ai-email-reply-generator
```

### **2️⃣ Backend (Spring Boot)**
```sh
cd backend
mvn spring-boot:run
```

### **3️⃣ Frontend (React Vite)**
```sh
cd frontend
npm install && npm run dev
```

### **4️⃣ Chrome Extension**
1. Open `chrome://extensions/` in Chrome.
2. Enable **Developer Mode** (top right corner).
3. Click **Load Unpacked** → Select the `extension/` folder.
4. Open Gmail & try the **AI Reply** feature!

---

## **🔗 Live Demo & GitHub**
📌 **GitHub:** [Repo Link](https://github.com/your-username/ai-email-reply-generator)  
📌 **Live Demo (If Deployed):** [Demo Link]

---

## **📸 Screenshots**
(Add images of your extension in action here)

---

## **✨ Future Enhancements**
- ✅ Deploy backend & frontend on AWS or Vercel
- ✅ Improve AI response customization options
- ✅ Enhance UI for better user experience

---

### **📧 Contact**
If you have any questions, feel free to reach out via [LinkedIn](https://linkedin.com/in/your-profile)!

🚀 **Happy Coding!**

