# import streamlit as st
# import pandas as pd
# import joblib

# # Load model, scaler, and expected columns
# model = joblib.load("C:/Users/Aman/OneDrive/Desktop/Python/heart dieases project/knn_heart_model.pkl")
# scaler = joblib.load("C:/Users/Aman/OneDrive/Desktop/Python/heart dieases project/scaler.pkl")
# expected_columns = joblib.load("C:/Users/Aman/OneDrive/Desktop/Python/heart dieases project/columns.pkl")

# # Streamlit UI
# st.title("Heart Disease Prediction App")
# st.markdown("### Provide the following details:")

# # Input fields
# age = st.slider("Age", 18, 100, 40)
# sex = st.selectbox("Sex", ['M', 'F'])
# chest_pain = st.selectbox("Chest Pain Type", ["ATA", "NAP", "TA", "ASY"])
# resting_bp = st.number_input("Resting Blood Pressure (mm Hg)", 80, 200, 120)
# cholestrol = st.number_input("Cholesterol (mg/dl)", 100, 600, 200)
# fasting_bs = st.selectbox("Fasting Blood Sugar > 120 mg/dl", [0, 1])
# resting_ecg = st.selectbox("Resting ECG", ["Normal", "ST", "LVH"])
# max_hr = st.slider("Max Heart Rate", 60, 220, 150)
# exercise_angina = st.selectbox("Exercise Induced Angina", ["Y", "N"])
# oldpeak = st.slider("Oldpeak", 0.0, 6.0, 1.0)
# st_slope = st.selectbox("ST Slope", ["Up", "Flat", "Down"])

# if st.button("Predict"):
#     # Base numeric inputs
#     raw_input = {
#         'Age': age,
#         'RestingBP': resting_bp,
#         'Cholesterol': cholestrol,
#         'FastingBS': fasting_bs,
#         'MaxHR': max_hr,
#         'Oldpeak': oldpeak
#     }

#     # One-hot encoded categorical features
#     categorical_vars = {
#         f'Sex_{sex}': 1,
#         f'ChestPainType_{chest_pain}': 1,
#         f'RestingECG_{resting_ecg}': 1,
#         f'ExerciseAngina_{exercise_angina}': 1,
#         f'ST_Slope_{st_slope}': 1
#     }

#     # Merge all inputs
#     for col in expected_columns:
#         if col in raw_input:
#             continue
#         elif col in categorical_vars:
#             raw_input[col] = 1
#         else:
#             raw_input[col] = 0  # Fill missing one-hot columns with 0

#     # Convert to DataFrame and reorder
#     input_df = pd.DataFrame([raw_input])[expected_columns]

#     # Scale and predict
#     scaled_input = scaler.transform(input_df)
#     prediction = model.predict(scaled_input)[0]

#     # Show result
#     if prediction == 1:
#         st.error("⚠ You are at risk of heart disease. Please consult a doctor.")      
#     else:
#         st.success("✅ You are not at risk of heart disease. Keep up the healthy lifestyle!")


import streamlit as st

st.title('hello wold')